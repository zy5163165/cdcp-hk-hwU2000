package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_QosRule_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_QosRule_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_QosRule_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public HW_mstpInventory.HW_QosType_T type;
	public globaldefs.NameAndStringValue_T[] paraList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_QosRule_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, HW_mstpInventory.HW_QosType_T type, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.type = type;
		this.paraList = paraList;
		this.additionalInfo = additionalInfo;
	}
}
