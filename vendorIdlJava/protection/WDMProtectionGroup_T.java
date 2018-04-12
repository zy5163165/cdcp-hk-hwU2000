package protection;

/**
 *	Generated from IDL definition of struct "WDMProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public WDMProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public globaldefs.NameAndStringValue_T[][] pgpTPList;
	public globaldefs.NameAndStringValue_T[] pgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public WDMProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, globaldefs.NameAndStringValue_T[][] pgpTPList, globaldefs.NameAndStringValue_T[] pgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
