package trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtCreateData_T(){}
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public globaldefs.NameAndStringValue_T[][] protectionTrail;
	public globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes;
	public TrailNtwProtCreateData_T(short rate, java.lang.String trailNtwProtectionType, globaldefs.NameAndStringValue_T[][][] workerTrailList, globaldefs.NameAndStringValue_T[][] protectionTrail, globaldefs.NameAndStringValue_T[] protectionGroupAName, globaldefs.NameAndStringValue_T[] protectionGroupZName, trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes)
	{
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.modifiableAttributes = modifiableAttributes;
	}
}
