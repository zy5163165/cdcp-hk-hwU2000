package protection;

/**
 *	Generated from IDL definition of struct "ESwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ESwitchData_T(){}
	public java.lang.String eProtectionGroupType;
	public java.lang.String eSwitchReason;
	public globaldefs.NameAndStringValue_T[] ePGPName;
	public globaldefs.NameAndStringValue_T[] protectedE;
	public globaldefs.NameAndStringValue_T[] switchToE;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ESwitchData_T(java.lang.String eProtectionGroupType, java.lang.String eSwitchReason, globaldefs.NameAndStringValue_T[] ePGPName, globaldefs.NameAndStringValue_T[] protectedE, globaldefs.NameAndStringValue_T[] switchToE, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.eProtectionGroupType = eProtectionGroupType;
		this.eSwitchReason = eSwitchReason;
		this.ePGPName = ePGPName;
		this.protectedE = protectedE;
		this.switchToE = switchToE;
		this.additionalInfo = additionalInfo;
	}
}
