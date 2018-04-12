package protection;

/**
 *	Generated from IDL definition of struct "IPSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class IPSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IPSwitchData_T(){}
	public java.lang.String protectionType = "";
	public protection.SwitchReason_T switchReason;
	public short layerRate;
	public globaldefs.NameAndStringValue_T[] groupName;
	public globaldefs.NameAndStringValue_T[][] protectedList;
	public globaldefs.NameAndStringValue_T[][] switchToList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPSwitchData_T(java.lang.String protectionType, protection.SwitchReason_T switchReason, short layerRate, globaldefs.NameAndStringValue_T[] groupName, globaldefs.NameAndStringValue_T[][] protectedList, globaldefs.NameAndStringValue_T[][] switchToList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedList = protectedList;
		this.switchToList = switchToList;
		this.additionalInfo = additionalInfo;
	}
}
