package maintenanceOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class MaintenanceMgr_IPOATie
	extends MaintenanceMgr_IPOA
{
	private MaintenanceMgr_IOperations _delegate;

	private POA _poa;
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public maintenanceOps.MaintenanceMgr_I _this()
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object());
	}
	public maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object(orb));
	}
	public MaintenanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaintenanceMgr_IOperations delegate)
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

	public void setServiceAlarmReportingOn(globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws globaldefs.ProcessingFailureException
	{
_delegate.setServiceAlarmReportingOn(serviceName,alarmEventList);
	}

	public void performMaintenanceOperationEx(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, globaldefs.NamingAttributesList_THolder resultOfMaintenanceData) throws globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperationEx(maintenanceOperation,maintenanceOperationMode,resultOfMaintenanceData);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllMaintenancePoints(globaldefs.NameAndStringValue_T[] mdOrMaName, int how_many, maintenanceOps.HW_MaintenancePointList_THolder mpList, maintenanceOps.HW_MaintenancePointIterator_IHolder mpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenancePoints(mdOrMaName,how_many,mpList,mpIt);
	}

	public void createMaintenanceDomain(maintenanceOps.HW_MaintenanceDomain_T md, maintenanceOps.HW_MaintenanceDomain_THolder theMD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createMaintenanceDomain(md,theMD,errorReason);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getOAMParameters(globaldefs.NameAndStringValue_T[] name, transmissionParameters.LayeredParameterList_THolder ParamList) throws globaldefs.ProcessingFailureException
	{
_delegate.getOAMParameters(name,ParamList);
	}

	public void setServiceAlarmReportingOff(globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws globaldefs.ProcessingFailureException
	{
_delegate.setServiceAlarmReportingOff(serviceName,alarmEventList);
	}

	public void getAllMaintenanceAssociations(globaldefs.NameAndStringValue_T[] mdName, int how_many, maintenanceOps.HW_MaintenanceAssociationList_THolder maList, maintenanceOps.HW_MaintenanceAssociationIterator_IHolder maIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenanceAssociations(mdName,how_many,maList,maIt);
	}

	public void getAllMaintenanceDomains(globaldefs.NameAndStringValue_T[] meName, int how_many, maintenanceOps.HW_MaintenanceDomainList_THolder mdList, maintenanceOps.HW_MaintenanceDomainIterator_IHolder mdIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenanceDomains(meName,how_many,mdList,mdIt);
	}

	public void enablePRBSTest(maintenanceOps.PRBSTestParameter_T[] testParaList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException
	{
_delegate.enablePRBSTest(testParaList,failedTPList);
	}

	public void getPRBSTestResult(globaldefs.NameAndStringValue_T[][] tpNameList, maintenanceOps.PRBSTestResultList_THolder resultList) throws globaldefs.ProcessingFailureException
	{
_delegate.getPRBSTestResult(tpNameList,resultList);
	}

	public void deleteMaintenancePoint(globaldefs.NameAndStringValue_T[] mpName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenancePoint(mpName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode);
	}

	public void disablePRBSTest(globaldefs.NameAndStringValue_T[][] tpNameList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException
	{
_delegate.disablePRBSTest(tpNameList,failedTPList);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void createMaintenancePoints(maintenanceOps.HW_MaintenancePointCreateData_T mpCreateData, maintenanceOps.HW_MaintenancePoint_THolder theMP, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createMaintenancePoints(mpCreateData,theMP,errorReason);
	}

	public void setOAMParameters(globaldefs.NameAndStringValue_T[] name, java.lang.String oamParamType, transmissionParameters.LayeredParameters_T[] ParamList, maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder oamParameters) throws globaldefs.ProcessingFailureException
	{
_delegate.setOAMParameters(name,oamParamType,ParamList,oamParameters);
	}

	public void createATMMaintenanceEntity(maintenanceOps.HW_ATMMaintenanceEntityAttr_T maintenanceEntityAttr, globaldefs.NVSList_THolder maintenanceEntityName) throws globaldefs.ProcessingFailureException
	{
_delegate.createATMMaintenanceEntity(maintenanceEntityAttr,maintenanceEntityName);
	}

	public void createMaintenanceAssociation(maintenanceOps.HW_MaintenanceAssociation_T ma, maintenanceOps.HW_MaintenanceAssociation_THolder theMA, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createMaintenanceAssociation(ma,theMA,errorReason);
	}

	public void deleteMaintenanceDomain(globaldefs.NameAndStringValue_T[] mdName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenanceDomain(mdName);
	}

	public void deleteMaintenanceAssociation(globaldefs.NameAndStringValue_T[] maName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenanceAssociation(maName);
	}

	public void getActiveMaintenanceOperations(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getActiveMaintenanceOperations(tpOrMeName,how_many,currentMaintenanceOpeationList,cmoIt);
	}

}
