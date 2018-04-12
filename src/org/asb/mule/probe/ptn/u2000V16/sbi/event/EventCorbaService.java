package org.asb.mule.probe.ptn.u2000V16.sbi.event;

import java.util.Timer;

import nmsSession.NmsSession_I;
import nmsSession.NmsSession_IHelper;

import org.asb.mule.probe.framework.service.CorbaSbiService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.framework.util.corba.CorbaMgr;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

import emsMgr.EMS_THolder;
import emsSession.EmsSession_I;
import emsSession.EmsSession_IHolder;
import emsSessionFactory.EmsSessionFactory_I;
import emsSessionFactory.EmsSessionFactory_IHelper;
import globaldefs.ProcessingFailureException;

public class EventCorbaService extends CorbaSbiService {

	private EventNmsSession nmsSession = null;
	private EmsSession_I _emsSession = null;
	private org.omg.CORBA.ORB orb = null;
	private org.omg.PortableServer.POA nmsPoa;

	private Timer timer = null;
	private EventHeartBeat heartBeat = null;

	private FileLogger eventlog = null;
	private boolean initlog = false;

	private void initLog() {
		eventlog = new FileLogger(getEmsName() + "/event.log");
		initlog = true;
	}

	public boolean init() {
		if (!initlog) {
			initLog();
		}

		eventlog.info("corbaService init in");
		setConnectState(connect());
		eventlog.info("corbaService init out");
		eventlog.info("collect data as debug after init");

		// DayMigrationJob job=new DayMigrationJob();
		// job.execute(null);
		return true;

	}

	public void linkFailure() {
		try {
			if (!reconnect()) {
				// MessageUtil.sendSBIFailedMessage("EMS_LOSS_COMM", taskSerial);
				disconnect();
			}
		} catch (Exception e) {
			eventlog.error("linkFailure Exception:", e);
		}

	}

	public boolean reconnect() {
		if (disconnect()) {
			return connect();
		}
		return false;
	}

	/**
	 * 核心方法
	 * 1.连接厂商网管
	 */
	public boolean connect() {
		eventlog.info(getCorbaTree());
		// 1.init orb
		if (orb == null) {
			CorbaMgr corba = CorbaMgr.instance();
			corba.initORB(getNamingServiceDns(), getNamingServiceIp(), eventlog);
			Thread corbaThread = new Thread(corba);
			corbaThread.start();

		}
		orb = CorbaMgr.instance().ORB();
		// org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(new String[0], null);

		try {
			// 2.connect vendor nameService
			eventlog.info("connect>>	vendor NameService URL = " + getCorbaUrl());
			Object string_to_object = orb.string_to_object(getCorbaUrl());
			NamingContextExt ns = NamingContextExtHelper.narrow(string_to_object);
			// 3. get EmsSessionFactory_I
			EmsSessionFactory_I _emsSessionFactory = null;
			_emsSessionFactory = EmsSessionFactory_IHelper.narrow(ns.resolve_str(getCorbaTree()));

			if (_emsSessionFactory == null) {
				eventlog.info("connect>>	Get EmsSessionFactory failed");
				return false;
			} else {
				eventlog.info("connect>>	Get EmsSessionFactory successfully.");
			}

			// 4. create poa

			nmsPoa = CorbaMgr.instance().createNmsSessionPOA(getEmsName());

			eventlog.info("connect>>	createNmsSessionPOA ok");

			// 5. create NmsSession client
			if (nmsSession != null) {
				disconnect();
			}

			nmsSession = new EventNmsSession(eventlog);
			nmsSession.set_poa(nmsPoa);

			org.omg.CORBA.Object nmsobj = null;
			try {
				nmsobj = nmsPoa.servant_to_reference(nmsSession);
			} catch (ServantNotActive e) {

				e.printStackTrace();
			} catch (WrongPolicy e) {

				e.printStackTrace();
			}

			eventlog.info("connect>>	NmsSession IOR:" + orb.object_to_string(NmsSession_IHelper.narrow(nmsobj)));
			NmsSession_I nmsSession_I = NmsSession_IHelper.narrow(nmsobj);

			eventlog.info("connect>>	active _nmsSession successfully");

			// 6. login by EmsSessionFactory_I,开始调用CORBA服务器端的'getEmsSession'方法"
			EmsSession_IHolder emsSessionHolder = new EmsSession_IHolder();
			_emsSessionFactory.getEmsSession(getCorbaUserName(), getCorbaPassword(), nmsSession_I, emsSessionHolder);

			eventlog.info("connect>>	EmsSession IOR:" + orb.object_to_string(emsSessionHolder.value));
			eventlog.info("connect>>	emsSessionFactory.getEmsSession successfully");
			_emsSession = emsSessionHolder.value;

			if (_emsSession == null) {
				eventlog.info("connect>>	Get EmsSession failed");
				return false;
			} else {
				nmsSession.setEmsSession(_emsSession);
				eventlog.info("connect>>	Get EmsSession successfully.");

			}
			String emsVersionInfo = _emsSessionFactory.getVersion();
			eventlog.info("**********************************************");
			eventlog.info("CORBA 服务器版本信息:" + emsVersionInfo);
			eventlog.info("**********************************************");

			nmsSession.getsupportedManagers();

			// set emsDn as cache
			EMS_THolder ems = new EMS_THolder();
			nmsSession.getEmsMgr().getEMS(ems);
			setEmsDn(ems.value.name[0].value);
			eventlog.info(ems.value.toString());

			// 7.receive alarm
			if (nmsSession.startAlarm()) {
				eventlog.info("startListenAlarm>>	success");
			} else {
				eventlog.info("startListenAlarm>>	failed.");
			}

			startHB();

		} catch (ProcessingFailureException pe) {
			eventlog.error("Failed to get ems session,detail: " + CodeTool.isoToGbk(pe.errorReason));
			eventlog.error("connect ProcessingFailureException: " + CodeTool.isoToGbk(pe.errorReason), pe);
			//
			return false;
		} catch (Exception e) {
			eventlog.error("connect>>	Exception: " + CodeTool.isoToGbk(e.getMessage()));
			eventlog.error("connect ProcessingFailureException: " + CodeTool.isoToGbk(e.getMessage()), e);
			//
			return false;
		}

		return true;

	}

	// 监测连接
	private void startHB() {
		if (timer == null) {
			timer = new Timer("HeartBeat-" + getEmsName());
		}
		if (heartBeat == null)
			heartBeat = new EventHeartBeat(this, eventlog);
		timer.scheduleAtFixedRate(heartBeat, 5000L, 2 * 60 * 1000L);
	}

	/**
	 * 核心方法
	 * 2.断开厂商网管
	 */
	public boolean disconnect() {
		try {
			if (nmsSession != null) {
				// nmsSession.waitAndShutdownSession();
				nmsSession.shutdownSession();
				nmsSession = null;
			}
			//
			if (timer != null) {
				timer.cancel();
				timer = null;
			}
			if (heartBeat != null) {
				heartBeat.cancel();
				heartBeat = null;
			}
		} catch (Throwable e) {
			eventlog.error("disConnect>>	Exception:" + e.getMessage());
			//return false;
		}
		setConnectState(false);
		return true;
	}

	/**
	 * @return the nmsSession
	 */
	public EventNmsSession getNmsSession() {
		return nmsSession;
	}

	/**
	 * @param nmsSession
	 *            the nmsSession to set
	 */
	public void setNmsSession(EventNmsSession nmsSession) {
		this.nmsSession = nmsSession;
	}

	public FileLogger geteventlog() {
		return eventlog;
	}
}
