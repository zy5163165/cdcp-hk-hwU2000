package equipment;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class EquipmentInventoryMgr_IPOATie
	extends EquipmentInventoryMgr_IPOA
{
	private EquipmentInventoryMgr_IOperations _delegate;

	private POA _poa;
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public equipment.EquipmentInventoryMgr_I _this()
	{
		return equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object());
	}
	public equipment.EquipmentInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object(orb));
	}
	public EquipmentInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentInventoryMgr_IOperations delegate)
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

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getPhysicalLocationInfo(equipment.PhysicalLocationInfoList_THolder phyLocationInfoList) throws globaldefs.ProcessingFailureException
	{
_delegate.getPhysicalLocationInfo(phyLocationInfoList);
	}

	public void getAllEquipmentNames(globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentNames(meOrHolderName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllEquipment(globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, equipment.EquipmentOrHolderList_THolder eqList, equipment.EquipmentOrHolderIterator_IHolder eqIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipment(meOrHolderName,how_many,eqList,eqIt);
	}

	public void getAllSupportingEquipmentNames(globaldefs.NameAndStringValue_T[] ptpName, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipmentNames(ptpName,nameList);
	}

	public void getAllSupportedPTPs(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPs(equipmentName,how_many,tpList,tpIt);
	}

	public void unprovisionEquipment(globaldefs.NameAndStringValue_T[] equipmentName) throws globaldefs.ProcessingFailureException
	{
_delegate.unprovisionEquipment(equipmentName);
	}

	public void getContainedEquipment(globaldefs.NameAndStringValue_T[] equipmentHolderName, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedEquipment(equipmentHolderName,equipmentOrHolderList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getEquipmentStaticInfo(java.lang.String[] typeList, int how_many, globaldefs.NamingAttributesList_THolder staticInfoList, globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getEquipmentStaticInfo(typeList,how_many,staticInfoList,staticInfoIt);
	}

	public void getAllEquipmentAdditionalInfo(globaldefs.NameAndStringValue_T[] meOrHolderName, equipment.ObjectAdditionalInfoList_THolder additionalInfoList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentAdditionalInfo(meOrHolderName,additionalInfoList);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllSupportingEquipment(globaldefs.NameAndStringValue_T[] ptpName, equipment.EquipmentOrHolderList_THolder eqList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipment(ptpName,eqList);
	}

	public void setAlarmReportingOff(globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(equipmentOrHolderName);
	}

	public void getEquipment(globaldefs.NameAndStringValue_T[] equipmentOrHolderName, equipment.EquipmentOrHolder_THolder equip) throws globaldefs.ProcessingFailureException
	{
_delegate.getEquipment(equipmentOrHolderName,equip);
	}

	public void getAlarmSeverityList(globaldefs.NameAndStringValue_T[] equipmentOrHolderName, equipment.SeverityList_THolder severityList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAlarmSeverityList(equipmentOrHolderName,severityList);
	}

	public void setAlarmReportingOn(globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(equipmentOrHolderName);
	}

	public void getAllSupportedPTPNames(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPNames(equipmentName,how_many,nameList,nameIt);
	}

	public void setAlarmSeverityList(globaldefs.NameAndStringValue_T[] equipmentOrHolderName, equipment.Severity_T[] severityList) throws globaldefs.ProcessingFailureException
	{
_delegate.setAlarmSeverityList(equipmentOrHolderName,severityList);
	}

	public void provisionEquipment(equipment.EQTCreateData_T equipmentCreateData, equipment.Equipment_THolder createdEquipment) throws globaldefs.ProcessingFailureException
	{
_delegate.provisionEquipment(equipmentCreateData,createdEquipment);
	}

}
