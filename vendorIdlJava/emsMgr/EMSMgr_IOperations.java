package emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface EMSMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getEMS(emsMgr.EMS_THolder emsInfo) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworks(int how_many, multiLayerSubnetwork.SubnetworkList_THolder sList, multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinks(int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTopLevelTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException;
	void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getAllEMSSystemActiveAlarms(notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getObjectRootAlarms(globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getObjectClockSourceStatus(globaldefs.NameAndStringValue_T[] managedElementName, emsMgr.ClockSourceStatusList_THolder clockSourceStatusList) throws globaldefs.ProcessingFailureException;
	void acknowledgeAlarms(java.lang.String[] alarmList, emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws globaldefs.ProcessingFailureException;
	void unacknowledgeAlarms(java.lang.String[] alarmList, emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws globaldefs.ProcessingFailureException;
	void getInventory(java.lang.String destination, java.lang.String userName, java.lang.String password, emsMgr.InventoryType_T[] typeList) throws globaldefs.ProcessingFailureException;
	void getEMSHeartbeatInterval(globaldefs.NameAndStringValue_T[] ems, org.omg.CORBA.IntHolder interval) throws globaldefs.ProcessingFailureException;
	void setEMSHeartbeatInterval(globaldefs.NameAndStringValue_T[] ems, int interval) throws globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getAllHistoryAlarms(globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getEMSTime(globaldefs.NVSList_THolder emsName, org.omg.CORBA.StringHolder emsTime) throws globaldefs.ProcessingFailureException;
	void setEMSTime(globaldefs.NameAndStringValue_T[] emsName, java.lang.String settedTime) throws globaldefs.ProcessingFailureException;
	void getTPFaultStatus(globaldefs.NameAndStringValue_T[][] tpNameList, emsMgr.EndTPFaultStatusList_THolder tpFaultStatusList) throws globaldefs.ProcessingFailureException;
	void clearAlarms(java.lang.String[] alarmList, emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws globaldefs.ProcessingFailureException;
	void getAllSecondlyAlarms(java.lang.String[] alarmList, notifications.EventList_THolder eventList) throws globaldefs.ProcessingFailureException;
	void getAlarmAffectedServiceNames(java.lang.String serialNumber, emsMgr.ServiceNameList_THolder serviceNameList) throws globaldefs.ProcessingFailureException;
}
