package protection;

/**
 *	Generated from IDL definition of struct "WDMSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public WDMSwitchData_T(){}
	public java.lang.String protectionType;
	public protection.SwitchReason_T switchReason;
	public globaldefs.NameAndStringValue_T[] wPGPName;
	public globaldefs.NameAndStringValue_T[] protectedTP;
	public globaldefs.NameAndStringValue_T[] switchToTP;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public WDMSwitchData_T(java.lang.String protectionType, protection.SwitchReason_T switchReason, globaldefs.NameAndStringValue_T[] wPGPName, globaldefs.NameAndStringValue_T[] protectedTP, globaldefs.NameAndStringValue_T[] switchToTP, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.wPGPName = wPGPName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
}
