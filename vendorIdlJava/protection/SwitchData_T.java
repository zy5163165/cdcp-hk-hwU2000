package protection;

/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SwitchData_T(){}
	public protection.ProtectionType_T protectionType;
	public protection.SwitchReason_T switchReason;
	public short layerRate;
	public globaldefs.NameAndStringValue_T[] groupName;
	public globaldefs.NameAndStringValue_T[] protectedTP;
	public globaldefs.NameAndStringValue_T[] switchToTP;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public SwitchData_T(protection.ProtectionType_T protectionType, protection.SwitchReason_T switchReason, short layerRate, globaldefs.NameAndStringValue_T[] groupName, globaldefs.NameAndStringValue_T[] protectedTP, globaldefs.NameAndStringValue_T[] switchToTP, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
}
