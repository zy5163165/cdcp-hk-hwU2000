package managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ManagedElementMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllManagedElements(int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException;
	void getAllManagedElementNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainingSubnetworkNames(globaldefs.NameAndStringValue_T[] managedElementName, globaldefs.NamingAttributesList_THolder subnetNames) throws globaldefs.ProcessingFailureException;
	void getAllPTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllPTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPoint_THolder tp) throws globaldefs.ProcessingFailureException;
	void getManagedElement(globaldefs.NameAndStringValue_T[] managedElementName, managedElement.ManagedElement_THolder me) throws globaldefs.ProcessingFailureException;
	void getContainedPotentialTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedPotentialTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainedInUseTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedInUseTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainedCurrentTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainingTPs(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;
	void getContainingTPNames(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NamingAttributesList_THolder tpNameList) throws globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void setTPData(subnetworkConnection.TPData_T tpInfo, terminationPoint.TerminationPoint_THolder modifiedTP) throws globaldefs.ProcessingFailureException;
	void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException;
	void getActiveAlarms(globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void checkActiveAlarms(org.omg.CosNotification.StructuredEvent[] activeEventList, notifications.EventList_THolder clearedEventList) throws globaldefs.ProcessingFailureException;
	void getAllAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, globaldefs.NamingAttributesList_THolder failedMeNameList) throws globaldefs.ProcessingFailureException;
	void getNEStaticInfo(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, globaldefs.NamingAttributesList_THolder staticInfoList, globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws globaldefs.ProcessingFailureException;
	void createCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException;
	void activateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException;
	void deactivateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException;
	void deleteCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException;
	void createFTP(flowDomain.FTPCreateData_T createData, subnetworkConnection.TPDataList_THolder tpsToModify, terminationPoint.TerminationPoint_THolder theFTP) throws globaldefs.ProcessingFailureException;
	void deleteFTP(globaldefs.NameAndStringValue_T[] ftpName) throws globaldefs.ProcessingFailureException;
	void modifyFTPMembers(globaldefs.NameAndStringValue_T[] ftpName, java.lang.String modifyType, subnetworkConnection.TPData_T[] tpList, subnetworkConnection.TPDataList_THolder successedTPList, subnetworkConnection.TPDataList_THolder failedTPList) throws globaldefs.ProcessingFailureException;
	void getFTPMembers(globaldefs.NameAndStringValue_T[] ftpName, subnetworkConnection.TPDataList_THolder tpList) throws globaldefs.ProcessingFailureException;
	void getADCInfo(globaldefs.NameAndStringValue_T[] objName, managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder adcInfoLst) throws globaldefs.ProcessingFailureException;
	void setADCInfo(managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T adcInfo, managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedadcInfo) throws globaldefs.ProcessingFailureException;
	void getAPRInfo(globaldefs.NameAndStringValue_T[] objName, managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder aprInfoLst) throws globaldefs.ProcessingFailureException;
	void setAPRInfo(managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T aprInfo, managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedaprInfo) throws globaldefs.ProcessingFailureException;
	void setAPEInfo(managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T apeInfo) throws globaldefs.ProcessingFailureException;
	void setwdmALCInfo(managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T wdmalcInfo) throws globaldefs.ProcessingFailureException;
	void setotnALCInfo(managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T otnalcInfo) throws globaldefs.ProcessingFailureException;
}
