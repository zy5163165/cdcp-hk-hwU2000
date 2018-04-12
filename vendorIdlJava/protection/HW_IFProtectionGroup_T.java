package protection;

/**
 *	Generated from IDL definition of struct "HW_IFProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_IFProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_IFProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public globaldefs.NameAndStringValue_T[][] pgpTPList;
	public globaldefs.NameAndStringValue_T[] pgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_IFProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, protection.ProtectionGroupType_T protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, short rate, globaldefs.NameAndStringValue_T[][] pgpTPList, globaldefs.NameAndStringValue_T[] pgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
