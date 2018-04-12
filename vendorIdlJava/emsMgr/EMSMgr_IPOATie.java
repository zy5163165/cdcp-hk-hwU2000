package emsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class EMSMgr_IPOATie
	extends EMSMgr_IPOA
{
	private EMSMgr_IOperations _delegate;

	private POA _poa;
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public emsMgr.EMSMgr_I _this()
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
	}
	public EMSMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSMgr_IOperations delegate)
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

	public void getInventory(java.lang.String destination, java.lang.String userName, java.lang.String password, emsMgr.InventoryType_T[] typeList) throws globaldefs.ProcessingFailureException
	{
_delegate.getInventory(destination,userName,password,typeList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllEMSSystemActiveAlarms(notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSSystemActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
	}

	public void acknowledgeAlarms(java.lang.String[] alarmList, emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws globaldefs.ProcessingFailureException
	{
_delegate.acknowledgeAlarms(alarmList,failedAlarmList);
	}

	public void unacknowledgeAlarms(java.lang.String[] alarmList, emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws globaldefs.ProcessingFailureException
	{
_delegate.unacknowledgeAlarms(alarmList,failedAlarmList);
	}

	public void getObjectRootAlarms(globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getObjectRootAlarms(objectName,startTime,endTime,how_many,eventList,eventIt);
	}

	public void getEMS(emsMgr.EMS_THolder emsInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.getEMS(emsInfo);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllTopLevelSubnetworks(int how_many, multiLayerSubnetwork.SubnetworkList_THolder sList, multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworks(how_many,sList,sIt);
	}

	public void setEMSTime(globaldefs.NameAndStringValue_T[] emsName, java.lang.String settedTime) throws globaldefs.ProcessingFailureException
	{
_delegate.setEMSTime(emsName,settedTime);
	}

	public void getEMSTime(globaldefs.NVSList_THolder emsName, org.omg.CORBA.StringHolder emsTime) throws globaldefs.ProcessingFailureException
	{
_delegate.getEMSTime(emsName,emsTime);
	}

	public void getAllTopLevelSubnetworkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworkNames(how_many,nameList,nameIt);
	}

	public void getAllTopLevelTopologicalLinks(int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinks(how_many,topoList,topoIt);
	}

	public void clearAlarms(java.lang.String[] alarmList, emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws globaldefs.ProcessingFailureException
	{
_delegate.clearAlarms(alarmList,failedAlarmList);
	}

	public void getAllTopLevelTopologicalLinkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinkNames(how_many,nameList,nameIt);
	}

	public void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllActiveAlarms(globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getObjectClockSourceStatus(globaldefs.NameAndStringValue_T[] managedElementName, emsMgr.ClockSourceStatusList_THolder clockSourceStatusList) throws globaldefs.ProcessingFailureException
	{
_delegate.getObjectClockSourceStatus(managedElementName,clockSourceStatusList);
	}

	public void getTopLevelTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopLevelTopologicalLink(topoLinkName,topoLink);
	}

	public void getEMSHeartbeatInterval(globaldefs.NameAndStringValue_T[] ems, org.omg.CORBA.IntHolder interval) throws globaldefs.ProcessingFailureException
	{
_delegate.getEMSHeartbeatInterval(ems,interval);
	}

	public void setEMSHeartbeatInterval(globaldefs.NameAndStringValue_T[] ems, int interval) throws globaldefs.ProcessingFailureException
	{
_delegate.setEMSHeartbeatInterval(ems,interval);
	}

	public void getAlarmAffectedServiceNames(java.lang.String serialNumber, emsMgr.ServiceNameList_THolder serviceNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAlarmAffectedServiceNames(serialNumber,serviceNameList);
	}

	public void getAllSecondlyAlarms(java.lang.String[] alarmList, notifications.EventList_THolder eventList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSecondlyAlarms(alarmList,eventList);
	}

	public void getTPFaultStatus(globaldefs.NameAndStringValue_T[][] tpNameList, emsMgr.EndTPFaultStatusList_THolder tpFaultStatusList) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPFaultStatus(tpNameList,tpFaultStatusList);
	}

	public void getAllHistoryAlarms(globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllHistoryAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
	}

}
