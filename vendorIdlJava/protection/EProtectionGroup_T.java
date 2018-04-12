package protection;

/**
 *	Generated from IDL definition of struct "EProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class EProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String eProtectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public globaldefs.NameAndStringValue_T[][] protectedList;
	public globaldefs.NameAndStringValue_T[][] protectingList;
	public globaldefs.NameAndStringValue_T[] ePgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String eProtectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, globaldefs.NameAndStringValue_T[][] protectedList, globaldefs.NameAndStringValue_T[][] protectingList, globaldefs.NameAndStringValue_T[] ePgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.eProtectionGroupType = eProtectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.protectedList = protectedList;
		this.protectingList = protectingList;
		this.ePgpParameters = ePgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
