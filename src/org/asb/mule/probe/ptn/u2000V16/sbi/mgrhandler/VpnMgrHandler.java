package org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler;

import globaldefs.NameAndStringValue_T;
import globaldefs.NamingAttributesIterator_IHolder;
import globaldefs.NamingAttributesList_THolder;
import globaldefs.ProcessingFailureException;

import java.util.Vector;

import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;

import HW_vpnManager.FDFrIterator_IHolder;
import HW_vpnManager.FDFrRoute_THolder;
import HW_vpnManager.FlowDomainFragmentList_THolder;
import HW_vpnManager.FlowDomainFragment_T;
import HW_vpnManager.HW_VPNMgr_I;
import HW_vpnManager.IPCrossConnectionIterator_IHolder;
import HW_vpnManager.IPCrossConnectionList_THolder;
import HW_vpnManager.IPCrossConnection_T;
import HW_vpnManager.MatrixFlowDomainFragment_T;
import HW_vpnManager.TrafficTrunkIterator_IHolder;
import HW_vpnManager.TrafficTrunkList_THolder;
import HW_vpnManager.TrafficTrunk_T;
import HW_vpnManager.TrafficTrunk_THolder;

public class VpnMgrHandler {
	private static VpnMgrHandler instance;

	private static final String head1 = "VpnMgrHandler::";

	public static VpnMgrHandler instance() {
		if (null == instance)
			instance = new VpnMgrHandler();

		return instance;
	}

	public IPCrossConnection_T[] retrieveIPRoutes(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] trafficTrunkName) throws ProcessingFailureException {
		IPCrossConnectionList_THolder iprouteList = new IPCrossConnectionList_THolder();

		java.util.Vector emsIpRouteVector = new java.util.Vector();

		vpnMgr.getIPRoutes(trafficTrunkName, iprouteList);

		for (int i = 0; i < iprouteList.value.length; i++) {
			emsIpRouteVector.addElement(iprouteList.value[i]);
		}

		IPCrossConnection_T[] routes = new IPCrossConnection_T[emsIpRouteVector.size()];
		emsIpRouteVector.copyInto(routes);

		// for (int i = 0; i < routes.length; i++) {
		// datalog.debug("Get ipRoutes :" + routes[i].toString());
		// }

		return routes;
	}

	public TrafficTrunk_T[] retrieveAllTrafficTrunks(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] fdName, FileLogger errorlog) throws ProcessingFailureException {
		TrafficTrunkList_THolder trafficTrunkList = new TrafficTrunkList_THolder();
		short[] connectionRateList = new short[0];
		TrafficTrunkIterator_IHolder trafficTrunkIt = new TrafficTrunkIterator_IHolder();

		Vector<TrafficTrunk_T> emsTrafficTrunkVector = new Vector<TrafficTrunk_T>();
		int how_many = 500;
		vpnMgr.getAllTrafficTrunks(fdName, connectionRateList, how_many, trafficTrunkList, trafficTrunkIt);

		for (TrafficTrunk_T trafficTrunk : trafficTrunkList.value) {
			emsTrafficTrunkVector.addElement(trafficTrunk);
		}

		if (null != trafficTrunkIt.value) {
			boolean shouldContinue = true;
			while (shouldContinue) {
				try {
					shouldContinue = trafficTrunkIt.value.next_n(how_many, trafficTrunkList);
					for (TrafficTrunk_T trafficTrunk : trafficTrunkList.value) {
						emsTrafficTrunkVector.addElement(trafficTrunk);
					}
				} catch (ProcessingFailureException e) {
					errorlog.error("retrieveAllTrafficTrunks ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
					shouldContinue = false;
				} catch (org.omg.CORBA.SystemException e) {
					errorlog.error("retrieveAllTrafficTrunks CORBA.SystemException: " + e.getMessage(), e);
					shouldContinue = false;
				}
			}

			try {
				trafficTrunkIt.value.destroy();
			} catch (Throwable ex) {
				// datalog.info("retrieveAllTrafficTrunk: destory Iterator");
			}
		}

		TrafficTrunk_T[] trafficTrunks = new TrafficTrunk_T[emsTrafficTrunkVector.size()];
		emsTrafficTrunkVector.copyInto(trafficTrunks);

		// for (int i = 0; i < trafficTrunks.length; i++) {
		// datalog.debug("Get trafficTrunks :" + trafficTrunks[i].toString());
		// }

		return trafficTrunks;
	}

	public NameAndStringValue_T[][] retrieveAllTrafficTrunkNames(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] fdName) throws ProcessingFailureException {
		NamingAttributesList_THolder trafficTrunkList = new NamingAttributesList_THolder();
		short[] connectionRateList = new short[0];
		NamingAttributesIterator_IHolder trafficTrunkIt = new NamingAttributesIterator_IHolder();

		Vector<NameAndStringValue_T[]> emsTrafficTrunkVector = new Vector<NameAndStringValue_T[]>();
		int how_many = 500;
		vpnMgr.getAllTrafficTrunkNames(fdName, connectionRateList, how_many, trafficTrunkList, trafficTrunkIt);

		for (NameAndStringValue_T[] names : trafficTrunkList.value) {
			emsTrafficTrunkVector.addElement(names);
		}

		if (null != trafficTrunkIt.value) {
			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = trafficTrunkIt.value.next_n(how_many, trafficTrunkList);
				for (NameAndStringValue_T[] names : trafficTrunkList.value) {
					emsTrafficTrunkVector.addElement(names);
				}
			}

			try {
				trafficTrunkIt.value.destroy();
			} catch (Throwable ex) {
				// datalog.info("retrieveAllTrafficTrunkNames Iterator destory.");
			}
		}

		NameAndStringValue_T[][] trafficTrunks = new NameAndStringValue_T[emsTrafficTrunkVector.size()][];
		emsTrafficTrunkVector.copyInto(trafficTrunks);

		return trafficTrunks;
	}

	public TrafficTrunk_T retrieveTrafficTrunk(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] trafficTrunkName) throws ProcessingFailureException {
		TrafficTrunk_THolder trafficTrunk = new TrafficTrunk_THolder();

		vpnMgr.getTrafficTrunk(trafficTrunkName, trafficTrunk);
		// datalog.debug("retrieveTrafficTrunk : " + trafficTrunk);
		return trafficTrunk.value;
	}

	public TrafficTrunk_T[] retrieveAllTrafficTrunksWithME(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] neName) throws ProcessingFailureException {
		TrafficTrunkList_THolder trafficTrunkList = new TrafficTrunkList_THolder();
		short[] connectionRateList = new short[0];
		TrafficTrunkIterator_IHolder trafficTrunkIt = new TrafficTrunkIterator_IHolder();

		Vector<TrafficTrunk_T> emsTrafficTrunkVector = new Vector<TrafficTrunk_T>();
		int how_many = 500;
		vpnMgr.getAllTrafficTrunksWithME(neName, connectionRateList, how_many, trafficTrunkList, trafficTrunkIt);

		for (TrafficTrunk_T names : trafficTrunkList.value) {
			emsTrafficTrunkVector.addElement(names);
		}

		if (null != trafficTrunkIt.value) {
			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = trafficTrunkIt.value.next_n(how_many, trafficTrunkList);

				for (TrafficTrunk_T names : trafficTrunkList.value) {
					emsTrafficTrunkVector.addElement(names);
				}
			}

			try {
				trafficTrunkIt.value.destroy();
			} catch (Throwable ex) {
				// datalog.info("retrieveAllTrafficTrunksWithME Iterator destory.");
			}
		}

		TrafficTrunk_T[] trafficTrunks = new TrafficTrunk_T[emsTrafficTrunkVector.size()];
		emsTrafficTrunkVector.copyInto(trafficTrunks);

		return trafficTrunks;
	}

	public MatrixFlowDomainFragment_T[] retrieveFDFrRoute(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] fdfr) throws ProcessingFailureException {
		FDFrRoute_THolder fDFrRoute = new FDFrRoute_THolder();
		vpnMgr.getFDFrRoute(fdfr, false, fDFrRoute);
		return fDFrRoute.value;
	}

	public FlowDomainFragment_T[] retrieveAllFDFrs(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] fdName) throws ProcessingFailureException {

		short[] connectionRateList = new short[0];
		FlowDomainFragmentList_THolder fdfrList = new FlowDomainFragmentList_THolder();
		FDFrIterator_IHolder fdfrIt = new FDFrIterator_IHolder();

		java.util.Vector fdfrsVector = new java.util.Vector();
		int how_many = 500;
		vpnMgr.getAllFDFrs(fdName, how_many, connectionRateList, fdfrList, fdfrIt);

		for (int i = 0; i < fdfrList.value.length; i++) {
			fdfrsVector.addElement(fdfrList.value[i]);
		}

		if (null != fdfrIt.value) {
			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = fdfrIt.value.next_n(how_many, fdfrList);

				for (int i = 0; i < fdfrList.value.length; i++)
					fdfrsVector.addElement(fdfrList.value[i]);
			}

			try {
				fdfrIt.value.destroy();
			} catch (Throwable ex) {
				// datalog.info("retrieveAllIPCrossConnections:destory Iterator");
			}
		}

		FlowDomainFragment_T[] fdfrs = new FlowDomainFragment_T[fdfrsVector.size()];
		fdfrsVector.copyInto(fdfrs);

		// for (int i = 0; i < fdfrs.length; i++) {
		// datalog.debug("Get fdfrs :" + fdfrs[i].toString());
		// }

		return fdfrs;
	}

	public IPCrossConnection_T[] retrieveAllIPCrossconnectionByMe(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] managedElementName)
			throws ProcessingFailureException {

		short[] connectionRateList = new short[0];
		IPCrossConnectionList_THolder ipCCList = new IPCrossConnectionList_THolder();
		IPCrossConnectionIterator_IHolder ipCCIt = new IPCrossConnectionIterator_IHolder();

		java.util.Vector ipCCVector = new java.util.Vector();
		int how_many = 500;
		vpnMgr.getAllIPCrossConnections(managedElementName, connectionRateList, how_many, ipCCList, ipCCIt);

		for (int i = 0; i < ipCCList.value.length; i++) {
			ipCCVector.addElement(ipCCList.value[i]);
		}

		if (null != ipCCIt.value) {
			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = ipCCIt.value.next_n(how_many, ipCCList);

				for (int i = 0; i < ipCCList.value.length; i++)
					ipCCVector.addElement(ipCCList.value[i]);
			}

			try {
				ipCCIt.value.destroy();
			} catch (Throwable ex) {
				// datalog.info("retrieveAllIPCrossConnections:destory Iterator");
			}
		}

		IPCrossConnection_T[] ipCCs = new IPCrossConnection_T[ipCCVector.size()];
		ipCCVector.copyInto(ipCCs);

		// for (int i = 0; i < ipCCs.length; i++) {
		// datalog.debug("Get ipCCs :" + ipCCs[i].toString());
		// }

		return ipCCs;
	}

	public IPCrossConnection_T[] getRoute(HW_VPNMgr_I vpnMgr, NameAndStringValue_T[] trafficTrunkName) throws ProcessingFailureException {

		IPCrossConnectionList_THolder routes = new IPCrossConnectionList_THolder();

		vpnMgr.getIPRoutes(trafficTrunkName, routes);

		// for (int i = 0; i < routes.value.length; i++) {
		// datalog.debug("getRoute :" + routes.value[i].toString());
		// }

		return routes.value;
	}

}
