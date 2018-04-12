package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_VirtualBridge_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_VirtualBridge_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_VirtualBridge_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public HW_mstpInventory.HW_MSTPEndPoint_T[] logicalTPList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_VirtualBridge_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, HW_mstpInventory.HW_MSTPEndPoint_T[] logicalTPList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.logicalTPList = logicalTPList;
		this.additionalInfo = additionalInfo;
	}
}
