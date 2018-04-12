package HW_vpnManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_VPNMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_VPNMgr_IPOATie
	extends HW_VPNMgr_IPOA
{
	private HW_VPNMgr_IOperations _delegate;

	private POA _poa;
	public HW_VPNMgr_IPOATie(HW_VPNMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_VPNMgr_IPOATie(HW_VPNMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_vpnManager.HW_VPNMgr_I _this()
	{
		return HW_vpnManager.HW_VPNMgr_IHelper.narrow(_this_object());
	}
	public HW_vpnManager.HW_VPNMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_vpnManager.HW_VPNMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_VPNMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_VPNMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void deactivateIPCrossConnections(globaldefs.NameAndStringValue_T[][] ipCCNameList, globaldefs.NamingAttributesList_THolder successedIPCCNameList, globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
	}

	public void createMFDFr(HW_vpnManager.MatrixFlowDomainFragment_T createData, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, globaldefs.NamingAttributesList_THolder notConnectableCPTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createMFDFr(createData,tpsToModify,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void getAllTrafficTrunkNames(globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunkNames(fdName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllFDFrs(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectionRateList,fdfrList,fdfrIt);
	}

	public void getAllFDFrNames(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrNames(fdName,how_many,connectionRateList,nameList,nameIt);
	}

	public void deactivateTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
	}

	public void deleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName, subnetworkConnection.TPDataList_THolder tpsToModify) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName,tpsToModify);
	}

	public void deleteTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTrafficTrunk(trafficTrunkName);
	}

	public void modifyTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunkModifyData_T modifyData, HW_vpnManager.TrafficTrunk_THolder newTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyTrafficTrunk(trafficTrunkName,modifyData,newTrafficTrunk,errorReason);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void deleteMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteMFDFr(mfdfrName);
	}

	public void deleteIPCrossConnections(globaldefs.NameAndStringValue_T[][] ipCCNameList, globaldefs.NamingAttributesList_THolder successedIPCCNameList, globaldefs.NamingAttributesList_THolder failedIPCCNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllTrafficTrunks(globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunks(fdName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void getAllIPCrossConnectionNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllIPCrossConnectionNames(managedElementName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getIPRoutes(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.IPCrossConnectionList_THolder routes) throws globaldefs.ProcessingFailureException
	{
_delegate.getIPRoutes(trafficTrunkName,routes);
	}

	public void activateTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.activateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
	}

	public void getAllMFDFrs(globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrList, HW_vpnManager.MFDFrIterator_IHolder mfdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDFrs(meName,connectionRateList,how_many,mfdfrList,mfdfrIt);
	}

	public void getAllIPCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, HW_vpnManager.IPCrossConnectionList_THolder ipCCList, HW_vpnManager.IPCrossConnectionIterator_IHolder ipCCIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllIPCrossConnections(managedElementName,connectionRateList,how_many,ipCCList,ipCCIt);
	}

	public void createTrafficTrunk(HW_vpnManager.TrafficTrunkCreateData_T createData, HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createTrafficTrunk(createData,theTrafficTrunk,errorReason);
	}

	public void getAllTrafficTrunksWithME(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunksWithME(managedElementName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void getAllMFDFrNames(globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDFrNames(meName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllTrafficTrunkNamesWithME(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunkNamesWithME(managedElementName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FlowDomainFragment_THolder theFDFr) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,theFDFr);
	}

	public void activateMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.activateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
	}

	public void deactivateMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
	}

	public void getTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunk_THolder trafficTrunk) throws globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunk(trafficTrunkName,trafficTrunk);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr) throws globaldefs.ProcessingFailureException
	{
_delegate.getMFDFr(mfdfrName,theMFDFr);
	}

	public void getFDFrServerTrail(globaldefs.NameAndStringValue_T[] fdfrName, globaldefs.NamingAttributesList_THolder serverNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrServerTrail(fdfrName,serverNameList);
	}

	public void activateIPCrossConnections(globaldefs.NameAndStringValue_T[][] ipCCNameList, globaldefs.NamingAttributesList_THolder successedIPCCNameList, globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.activateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
	}

	public void deactivateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void getTrafficTrunkRoute(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.IPCrossConnectionList_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunkRoute(trafficTrunkName,route);
	}

	public void getFDFrRoute(globaldefs.NameAndStringValue_T[] fdfrName, boolean includeHigherOrderCCs, HW_vpnManager.FDFrRoute_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoute(fdfrName,includeHigherOrderCCs,route);
	}

	public void getIPCrossConnection(globaldefs.NameAndStringValue_T[] ipCCName, HW_vpnManager.IPCrossConnection_THolder ipCC) throws globaldefs.ProcessingFailureException
	{
_delegate.getIPCrossConnection(ipCCName,ipCC);
	}

	public void modifyMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, HW_vpnManager.MFDFrModifyData_T modifyData, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, globaldefs.NamingAttributesList_THolder notConnectableCPTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyMFDFr(mfdfrName,modifyData,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void activateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void createIPCrossConnections(HW_vpnManager.IPCrossConnection_T[] ipCCList, HW_vpnManager.IPCrossConnectionList_THolder successedIPCCList, HW_vpnManager.IPCrossConnectionList_THolder failedIPCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.createIPCrossConnections(ipCCList,successedIPCCList,failedIPCCList);
	}

	public void modifyIPCrossConnection(globaldefs.NameAndStringValue_T[] ipCCName, transmissionParameters.LayeredParameters_T transmissionParams, HW_vpnManager.IPCrossConnection_THolder newIPCC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyIPCrossConnection(ipCCName,transmissionParams,newIPCC,errorReason);
	}

	public void createFDFr(HW_vpnManager.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, subnetworkConnection.TPDataList_THolder endTPs, subnetworkConnection.TPDataList_THolder internalTPs, HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void modifyFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FDFrModifyData_T fdfrModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.GradesOfImpact_T tolerableImpact, HW_vpnManager.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
	}

}
