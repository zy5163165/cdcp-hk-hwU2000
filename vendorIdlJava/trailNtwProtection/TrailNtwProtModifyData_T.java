package trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ReversionMode_T reversionMode;
	public globaldefs.NameAndStringValue_T[][] pgATPList;
	public globaldefs.NameAndStringValue_T[][] pgZTPList;
	public globaldefs.NameAndStringValue_T[] tnpParameters;
	public java.lang.String apsFunction = "";
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrailNtwProtModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String nativeEMSName, java.lang.String owner, protection.ProtectionGroupType_T protectionGroupType, protection.ReversionMode_T reversionMode, globaldefs.NameAndStringValue_T[][] pgATPList, globaldefs.NameAndStringValue_T[][] pgZTPList, globaldefs.NameAndStringValue_T[] tnpParameters, java.lang.String apsFunction, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.reversionMode = reversionMode;
		this.pgATPList = pgATPList;
		this.pgZTPList = pgZTPList;
		this.tnpParameters = tnpParameters;
		this.apsFunction = apsFunction;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalInfo = additionalInfo;
	}
}
