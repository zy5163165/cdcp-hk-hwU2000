package protection;

/**
 *	Generated from IDL definition of struct "HW_ERPSProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ERPSProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_ERPSProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public globaldefs.NameAndStringValue_T[][] pgpTPList;
	public globaldefs.NameAndStringValue_T[] pgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ERPSProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, protection.ReversionMode_T reversionMode, short rate, globaldefs.NameAndStringValue_T[][] pgpTPList, globaldefs.NameAndStringValue_T[] pgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
