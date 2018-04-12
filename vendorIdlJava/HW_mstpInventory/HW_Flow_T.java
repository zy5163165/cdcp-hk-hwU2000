package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_Flow_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_Flow_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_Flow_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[][] qosRuleNames;
	public globaldefs.NameAndStringValue_T[] paraList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_Flow_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[][] qosRuleNames, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.qosRuleNames = qosRuleNames;
		this.paraList = paraList;
		this.additionalInfo = additionalInfo;
	}
}
