package maintenanceOps;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface MaintenanceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws globaldefs.ProcessingFailureException;
	void performMaintenanceOperationEx(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, globaldefs.NamingAttributesList_THolder resultOfMaintenanceData) throws globaldefs.ProcessingFailureException;
	void getActiveMaintenanceOperations(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws globaldefs.ProcessingFailureException;
	void enablePRBSTest(maintenanceOps.PRBSTestParameter_T[] testParaList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException;
	void disablePRBSTest(globaldefs.NameAndStringValue_T[][] tpNameList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException;
	void getPRBSTestResult(globaldefs.NameAndStringValue_T[][] tpNameList, maintenanceOps.PRBSTestResultList_THolder resultList) throws globaldefs.ProcessingFailureException;
	void createMaintenanceDomain(maintenanceOps.HW_MaintenanceDomain_T md, maintenanceOps.HW_MaintenanceDomain_THolder theMD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllMaintenanceDomains(globaldefs.NameAndStringValue_T[] meName, int how_many, maintenanceOps.HW_MaintenanceDomainList_THolder mdList, maintenanceOps.HW_MaintenanceDomainIterator_IHolder mdIt) throws globaldefs.ProcessingFailureException;
	void createMaintenanceAssociation(maintenanceOps.HW_MaintenanceAssociation_T ma, maintenanceOps.HW_MaintenanceAssociation_THolder theMA, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllMaintenanceAssociations(globaldefs.NameAndStringValue_T[] mdName, int how_many, maintenanceOps.HW_MaintenanceAssociationList_THolder maList, maintenanceOps.HW_MaintenanceAssociationIterator_IHolder maIt) throws globaldefs.ProcessingFailureException;
	void createMaintenancePoints(maintenanceOps.HW_MaintenancePointCreateData_T mpCreateData, maintenanceOps.HW_MaintenancePoint_THolder theMP, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllMaintenancePoints(globaldefs.NameAndStringValue_T[] mdOrMaName, int how_many, maintenanceOps.HW_MaintenancePointList_THolder mpList, maintenanceOps.HW_MaintenancePointIterator_IHolder mpIt) throws globaldefs.ProcessingFailureException;
	void deleteMaintenanceDomain(globaldefs.NameAndStringValue_T[] mdName) throws globaldefs.ProcessingFailureException;
	void deleteMaintenanceAssociation(globaldefs.NameAndStringValue_T[] maName) throws globaldefs.ProcessingFailureException;
	void deleteMaintenancePoint(globaldefs.NameAndStringValue_T[] mpName) throws globaldefs.ProcessingFailureException;
	void createATMMaintenanceEntity(maintenanceOps.HW_ATMMaintenanceEntityAttr_T maintenanceEntityAttr, globaldefs.NVSList_THolder maintenanceEntityName) throws globaldefs.ProcessingFailureException;
	void setOAMParameters(globaldefs.NameAndStringValue_T[] name, java.lang.String oamParamType, transmissionParameters.LayeredParameters_T[] ParamList, maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder oamParameters) throws globaldefs.ProcessingFailureException;
	void getOAMParameters(globaldefs.NameAndStringValue_T[] name, transmissionParameters.LayeredParameterList_THolder ParamList) throws globaldefs.ProcessingFailureException;
	void setServiceAlarmReportingOn(globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws globaldefs.ProcessingFailureException;
	void setServiceAlarmReportingOff(globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws globaldefs.ProcessingFailureException;
}
