package protection;

/**
 *	Generated from IDL definition of struct "IPProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class IPProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IPProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionGroupType = "";
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public globaldefs.NameAndStringValue_T[][] protectedList;
	public globaldefs.NameAndStringValue_T[][] protectingList;
	public globaldefs.NameAndStringValue_T[] pgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, short rate, globaldefs.NameAndStringValue_T[][] protectedList, globaldefs.NameAndStringValue_T[][] protectingList, globaldefs.NameAndStringValue_T[] pgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.protectedList = protectedList;
		this.protectingList = protectingList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
