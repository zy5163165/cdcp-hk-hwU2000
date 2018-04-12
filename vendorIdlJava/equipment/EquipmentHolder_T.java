package equipment;

/**
 *	Generated from IDL definition of struct "EquipmentHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EquipmentHolder_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public java.lang.String holderType;
	public globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment;
	public java.lang.String[] acceptableEquipmentTypeList;
	public equipment.HolderState_T holderState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EquipmentHolder_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, java.lang.String holderType, globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment, java.lang.String[] acceptableEquipmentTypeList, equipment.HolderState_T holderState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.holderType = holderType;
		this.expectedOrInstalledEquipment = expectedOrInstalledEquipment;
		this.acceptableEquipmentTypeList = acceptableEquipmentTypeList;
		this.holderState = holderState;
		this.additionalInfo = additionalInfo;
	}
}
