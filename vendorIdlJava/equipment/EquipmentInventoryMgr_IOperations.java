package equipment;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface EquipmentInventoryMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void provisionEquipment(equipment.EQTCreateData_T equipmentCreateData, equipment.Equipment_THolder createdEquipment) throws globaldefs.ProcessingFailureException;
	void unprovisionEquipment(globaldefs.NameAndStringValue_T[] equipmentName) throws globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws globaldefs.ProcessingFailureException;
	void getContainedEquipment(globaldefs.NameAndStringValue_T[] equipmentHolderName, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException;
	void getEquipment(globaldefs.NameAndStringValue_T[] equipmentOrHolderName, equipment.EquipmentOrHolder_THolder equip) throws globaldefs.ProcessingFailureException;
	void getAllEquipment(globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, equipment.EquipmentOrHolderList_THolder eqList, equipment.EquipmentOrHolderIterator_IHolder eqIt) throws globaldefs.ProcessingFailureException;
	void getAllEquipmentNames(globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllSupportedPTPs(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllSupportedPTPNames(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllSupportingEquipment(globaldefs.NameAndStringValue_T[] ptpName, equipment.EquipmentOrHolderList_THolder eqList) throws globaldefs.ProcessingFailureException;
	void getAllSupportingEquipmentNames(globaldefs.NameAndStringValue_T[] ptpName, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getEquipmentStaticInfo(java.lang.String[] typeList, int how_many, globaldefs.NamingAttributesList_THolder staticInfoList, globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws globaldefs.ProcessingFailureException;
	void getPhysicalLocationInfo(equipment.PhysicalLocationInfoList_THolder phyLocationInfoList) throws globaldefs.ProcessingFailureException;
	void getAllEquipmentAdditionalInfo(globaldefs.NameAndStringValue_T[] meOrHolderName, equipment.ObjectAdditionalInfoList_THolder additionalInfoList) throws globaldefs.ProcessingFailureException;
	void getAlarmSeverityList(globaldefs.NameAndStringValue_T[] equipmentOrHolderName, equipment.SeverityList_THolder severityList) throws globaldefs.ProcessingFailureException;
	void setAlarmSeverityList(globaldefs.NameAndStringValue_T[] equipmentOrHolderName, equipment.Severity_T[] severityList) throws globaldefs.ProcessingFailureException;
}
