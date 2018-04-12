package HW_vpnManager;

/**
 *	Generated from IDL interface "HW_VPNMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_VPNMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createMFDFr(HW_vpnManager.MatrixFlowDomainFragment_T createData, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, globaldefs.NamingAttributesList_THolder notConnectableCPTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void modifyMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, HW_vpnManager.MFDFrModifyData_T modifyData, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, globaldefs.NamingAttributesList_THolder notConnectableCPTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName) throws globaldefs.ProcessingFailureException;
	void activateMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deactivateMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllMFDFrs(globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrList, HW_vpnManager.MFDFrIterator_IHolder mfdfrIt) throws globaldefs.ProcessingFailureException;
	void getAllMFDFrNames(globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getMFDFr(globaldefs.NameAndStringValue_T[] mfdfrName, HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr) throws globaldefs.ProcessingFailureException;
	void getAllTrafficTrunksWithME(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws globaldefs.ProcessingFailureException;
	void getAllTrafficTrunkNamesWithME(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void createTrafficTrunk(HW_vpnManager.TrafficTrunkCreateData_T createData, HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName) throws globaldefs.ProcessingFailureException;
	void activateTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deactivateTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunk_THolder trafficTrunk) throws globaldefs.ProcessingFailureException;
	void modifyTrafficTrunk(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.TrafficTrunkModifyData_T modifyData, HW_vpnManager.TrafficTrunk_THolder newTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllIPCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, HW_vpnManager.IPCrossConnectionList_THolder ipCCList, HW_vpnManager.IPCrossConnectionIterator_IHolder ipCCIt) throws globaldefs.ProcessingFailureException;
	void getAllIPCrossConnectionNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void createIPCrossConnections(HW_vpnManager.IPCrossConnection_T[] ipCCList, HW_vpnManager.IPCrossConnectionList_THolder successedIPCCList, HW_vpnManager.IPCrossConnectionList_THolder failedIPCCList) throws globaldefs.ProcessingFailureException;
	void deleteIPCrossConnections(globaldefs.NameAndStringValue_T[][] ipCCNameList, globaldefs.NamingAttributesList_THolder successedIPCCNameList, globaldefs.NamingAttributesList_THolder failedIPCCNameList) throws globaldefs.ProcessingFailureException;
	void getIPCrossConnection(globaldefs.NameAndStringValue_T[] ipCCName, HW_vpnManager.IPCrossConnection_THolder ipCC) throws globaldefs.ProcessingFailureException;
	void modifyIPCrossConnection(globaldefs.NameAndStringValue_T[] ipCCName, transmissionParameters.LayeredParameters_T transmissionParams, HW_vpnManager.IPCrossConnection_THolder newIPCC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void activateIPCrossConnections(globaldefs.NameAndStringValue_T[][] ipCCNameList, globaldefs.NamingAttributesList_THolder successedIPCCNameList, globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deactivateIPCrossConnections(globaldefs.NameAndStringValue_T[][] ipCCNameList, globaldefs.NamingAttributesList_THolder successedIPCCNameList, globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void createFDFr(HW_vpnManager.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, subnetworkConnection.TPDataList_THolder endTPs, subnetworkConnection.TPDataList_THolder internalTPs, HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, HW_vpnManager.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void modifyFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FDFrModifyData_T fdfrModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.GradesOfImpact_T tolerableImpact, HW_vpnManager.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName, subnetworkConnection.TPDataList_THolder tpsToModify) throws globaldefs.ProcessingFailureException;
	void activateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void deactivateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void getTrafficTrunkRoute(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.IPCrossConnectionList_THolder route) throws globaldefs.ProcessingFailureException;
	void getAllFDFrs(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;
	void getAllFDFrNames(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getFDFr(globaldefs.NameAndStringValue_T[] fdfrName, HW_vpnManager.FlowDomainFragment_THolder theFDFr) throws globaldefs.ProcessingFailureException;
	void getFDFrRoute(globaldefs.NameAndStringValue_T[] fdfrName, boolean includeHigherOrderCCs, HW_vpnManager.FDFrRoute_THolder route) throws globaldefs.ProcessingFailureException;
	void getFDFrServerTrail(globaldefs.NameAndStringValue_T[] fdfrName, globaldefs.NamingAttributesList_THolder serverNameList) throws globaldefs.ProcessingFailureException;
	void getAllTrafficTrunks(globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws globaldefs.ProcessingFailureException;
	void getAllTrafficTrunkNames(globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getIPRoutes(globaldefs.NameAndStringValue_T[] trafficTrunkName, HW_vpnManager.IPCrossConnectionList_THolder routes) throws globaldefs.ProcessingFailureException;
}
