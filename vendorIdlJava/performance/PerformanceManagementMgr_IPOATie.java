package performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class PerformanceManagementMgr_IPOATie
	extends PerformanceManagementMgr_IPOA
{
	private PerformanceManagementMgr_IOperations _delegate;

	private POA _poa;
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public performance.PerformanceManagementMgr_I _this()
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
	}
	public PerformanceManagementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PerformanceManagementMgr_IOperations delegate)
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
	public void getMEPMcapabilities(globaldefs.NameAndStringValue_T[] meName, short layerRate, performance.PMParameterList_THolder pmParameterList) throws globaldefs.ProcessingFailureException
	{
_delegate.getMEPMcapabilities(meName,layerRate,pmParameterList);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void enablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.enablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void selectPMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName, performance.CollectTaskInfoList_THolder taskInfoList) throws globaldefs.ProcessingFailureException
	{
_delegate.selectPMCollectionTask(taskNameList,emsUserName,taskInfoList);
	}

	public void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
	}

	public void getHoldingTime(performance.HoldingTime_THolder holdingTime) throws globaldefs.ProcessingFailureException
	{
_delegate.getHoldingTime(holdingTime);
	}

	public void ModifyPMCollectionTask(java.lang.String oldTaskName, java.lang.String newTaskName, java.lang.String emsUserName) throws globaldefs.ProcessingFailureException
	{
_delegate.ModifyPMCollectionTask(oldTaskName,newTaskName,emsUserName);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void createPMCollectionTask(java.lang.String taskName, java.lang.String destination, java.lang.String userName, java.lang.String password, java.lang.String emsUserName, globaldefs.NameAndStringValue_T[][] pmTPSelectList, java.lang.String period, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws globaldefs.ProcessingFailureException
	{
_delegate.createPMCollectionTask(taskName,destination,userName,password,emsUserName,pmTPSelectList,period,startTime,endTime,forceUpload);
	}

	public void getPMState(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, performance.PMStateList_THolder pmStateList, performance.PMStateIterator_IHolder pmStateIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getPMState(pmTPSelectList,pmParameters,how_many,pmStateList,pmStateIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void disableTCA(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.disableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void enableTCA(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.enableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setTCANotifySwitch(boolean tcaNotifySwitch) throws globaldefs.ProcessingFailureException
	{
_delegate.setTCANotifySwitch(tcaNotifySwitch);
	}

	public void SuspendPMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws globaldefs.ProcessingFailureException
	{
_delegate.SuspendPMCollectionTask(taskName,emsUserName);
	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMData(destination,userName,password,pmTPSelectList,pmParameters,startTime,endTime,forceUpload);
	}

	public void setTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, performance.TCAParameters_THolder tcaParameters) throws globaldefs.ProcessingFailureException
	{
_delegate.setTCATPParameter(tpName,tcaParameters);
	}

	public void disablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.disablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void ResumePMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws globaldefs.ProcessingFailureException
	{
_delegate.ResumePMCollectionTask(taskName,emsUserName);
	}

	public void getTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, performance.TCAParameters_THolder tcaParameter) throws globaldefs.ProcessingFailureException
	{
_delegate.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
	}

	public void getTPHistoryPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
	}

	public void clearPMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void deletePMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName) throws globaldefs.ProcessingFailureException
	{
_delegate.deletePMCollectionTask(taskNameList,emsUserName);
	}

}
