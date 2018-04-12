package org.asb.mule.probe.ptn.u2000V16;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.asb.mule.probe.framework.entity.DeviceInfo;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DayMigrationJob;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DayMigrationJob4SDH;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DeviceJob;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import com.alcatelsbell.cdcp.nodefx.CDCPConstants;
import com.alcatelsbell.cdcp.nodefx.CorbaEms;
import com.alcatelsbell.cdcp.nodefx.EmsAdapter;
import com.alcatelsbell.cdcp.nodefx.EmsJob;
import com.alcatelsbell.cdcp.nodefx.LifecycleState;
import com.alcatelsbell.cdcp.nodefx.NodeException;
import com.alcatelsbell.nms.valueobject.sys.Ems;

/**
 * Author: Ronnie.Chen
 * Date: 13-9-10
 * Time: 下午8:59
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class HWU2000EmsAdapter implements EmsAdapter {

	@Override
	public void newEms(Ems ems) throws NodeException {
		CorbaEms corbaEms = new CorbaEms(ems);
	}

	@Override
	public void removeEms(Ems ems) throws NodeException {
		CorbaEms corbaEms = new CorbaEms(ems);
	}

	@Override
	public void updateEms(Ems ems) throws NodeException {
		CorbaEms corbaEms = new CorbaEms(ems);
	}

	@Override
	public String getType() {
		return "HWU2000";
	}

	@Override
	public boolean testEms(Ems ems) throws NodeException {
		if (corbaService != null) {
			return corbaService.isConnectState();
		} else {
			corbaService = new CorbaService();
			initCorbaService(ems);
			return corbaService.isConnectState();
		}
		// return false;
	}

	@Override
	public LifecycleState getState(Ems ems) throws NodeException {
		CorbaEms corbaEms = new CorbaEms(ems);
		return null;
	}

	private static CorbaService corbaService = null;
	private static U2000Service nbiservice = null;

	@Override
	public void executeJob(EmsJob emsJob) throws NodeException {
		if (EmsJob.JOB_TYPE_SYNC_DEVICE.equals(emsJob.getJobType())) {
			String devicedn = (String) emsJob.getDataMap().get(CDCPConstants.EMSJOB_DATA_KEY_DEVICE_DN);
			String synType = (String) emsJob.getDataMap().get(CDCPConstants.EMSJOB_DATA_KEY_SYNC_TYPE);
			if (synType.equals(CDCPConstants.EMSJOB_DATA_VALUE_SYNC_TYPE_MAN)) {
				syncDevice(emsJob.getEms(), emsJob.getSerial(), devicedn);
			} else if (synType.equals(CDCPConstants.EMSJOB_DATA_VALUE_SYNC_TYPE_AUTO)) {
				System.err.println("EMSJOB_DATA_VALUE_SYNC_TYPE_AUTO not implemented.");
			}
		} else {
			syncEMS(emsJob.getEms(), emsJob.getSerial());
		}
	}

	private void syncEMS(Ems ems, String serial) {
		if (corbaService != null) {
			corbaService.disconnect();
		} else {
			corbaService = new CorbaService();
		}
		initCorbaService(ems);
        if (ems.getTag1() == null) ems.setTag1("PTN");
        if (ems.getTag1().equals("SDH") || ems.getTag1().equals("OTN") || ems.getTag1().equals("DWDM")) {
            DayMigrationJob4SDH job = new DayMigrationJob4SDH();
            job.setEmstype(ems.getTag1());
            job.setService(nbiservice);
            job.setSerial(serial);
            job.execute();
        }
        else {
            DayMigrationJob job = new DayMigrationJob();
            job.setService(nbiservice);
            job.setSerial(serial);
            job.execute();
        }
	}

	private void syncDevice(Ems ems, String serial, String devicedn) throws NodeException {
		try {
			if (corbaService == null) {
				corbaService = new CorbaService();
				initCorbaService(ems);
			} else if (!corbaService.isConnectState()) {
				initCorbaService(ems);
			}
			if (nbiservice == null) {
				initCorbaService(ems);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new NodeException("EmsDisconnected", e);
		}
		try {
			DeviceJob job = new DeviceJob(devicedn);
			job.setService(nbiservice);
			job.setSerial(serial);
			job.execute();
		} catch (Exception e) {
			e.printStackTrace();
			throw new NodeException("NEException", e);
		}

	}

	@Override
	public List<DeviceInfo> listDevices(Ems ems) throws NodeException {
		try {
			if (corbaService == null) {
				corbaService = new CorbaService();
				initCorbaService(ems);
			} else if (!corbaService.isConnectState()) {
				initCorbaService(ems);
			}
			if (nbiservice == null) {
				initCorbaService(ems);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new NodeException("EmsDisconnected", e);
		}
		try {
			List<ManagedElement> nes = nbiservice.retrieveAllManagedElements();
			List<DeviceInfo> deviceInfos = new ArrayList<DeviceInfo>();
			for (ManagedElement ne : nes) {
				DeviceInfo deviceInfo = new DeviceInfo();
				deviceInfo.setDn(ne.getDn());
				deviceInfo.setDeviceDn(ne.getDn());
				deviceInfo.setDeviceName(ne.getNativeEMSName());
				deviceInfo.setProductNme(ne.getProductName());
				deviceInfo.setCreateDate(new Date());
				deviceInfo.setEmsName(corbaService.getEmsDn());

				deviceInfos.add(deviceInfo);
			}
			return deviceInfos;
		} catch (Exception e) {
			e.printStackTrace();
			throw new NodeException("NEException", e);
		}

	}

	private void initCorbaService(Ems ems) {
		CorbaEms corbaEms = new CorbaEms(ems);
		corbaService.setEmsName(corbaEms.getEmsName());
		corbaService.setNamingServiceDns("off");
		corbaService.setNamingServiceIp(corbaEms.getNamingServiceHost());
		corbaService.setCorbaUrl(corbaEms.getCorbaUrl());
		corbaService.setCorbaTree(corbaEms.getCorbaTree());
		corbaService.setCorbaUserName(corbaEms.getCorbaUserName());
		corbaService.setCorbaPassword(corbaEms.getCorbaPassword());
		corbaService.init();

		nbiservice = new U2000Service();
		nbiservice.setCorbaService(corbaService);
		nbiservice.setKey("2000");
	}
}
