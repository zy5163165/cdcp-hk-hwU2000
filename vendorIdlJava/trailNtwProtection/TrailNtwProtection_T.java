package trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtection_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public globaldefs.NameAndStringValue_T[][] pgATPList;
	public globaldefs.NameAndStringValue_T[][] pgZTPList;
	public globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public globaldefs.NameAndStringValue_T[][] protectionTrail;
	public globaldefs.NameAndStringValue_T[] tnpParameters;
	public java.lang.String apsFunction = "";
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrailNtwProtection_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, protection.ProtectionGroupType_T protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, short rate, java.lang.String trailNtwProtectionType, globaldefs.NameAndStringValue_T[] protectionGroupAName, globaldefs.NameAndStringValue_T[] protectionGroupZName, globaldefs.NameAndStringValue_T[][] pgATPList, globaldefs.NameAndStringValue_T[][] pgZTPList, globaldefs.NameAndStringValue_T[][][] workerTrailList, globaldefs.NameAndStringValue_T[][] protectionTrail, globaldefs.NameAndStringValue_T[] tnpParameters, java.lang.String apsFunction, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.pgATPList = pgATPList;
		this.pgZTPList = pgZTPList;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.tnpParameters = tnpParameters;
		this.apsFunction = apsFunction;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalInfo = additionalInfo;
	}
}
