package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_VirtualLAN_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_VirtualLAN_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_VirtualLAN_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] paraList;
	public HW_mstpInventory.HW_ForwardEndPoint_T[] forwardTPList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_VirtualLAN_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_ForwardEndPoint_T[] forwardTPList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.paraList = paraList;
		this.forwardTPList = forwardTPList;
		this.additionalInfo = additionalInfo;
	}
}
