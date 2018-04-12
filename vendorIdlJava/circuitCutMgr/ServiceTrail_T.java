package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ServiceTrail_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceTrail_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServiceTrail_T(){}
	public int serviceTrailID;
	public java.lang.String serviceTrailName = "";
	public int[] usedTSList;
	public circuitCutMgr.TPInfo_T aTP;
	public circuitCutMgr.TPInfo_T zTP;
	public circuitCutMgr.ConnectionDirection_T direction;
	public int psnInId;
	public int psnOutId;
	public ServiceTrail_T(int serviceTrailID, java.lang.String serviceTrailName, int[] usedTSList, circuitCutMgr.TPInfo_T aTP, circuitCutMgr.TPInfo_T zTP, circuitCutMgr.ConnectionDirection_T direction, int psnInId, int psnOutId)
	{
		this.serviceTrailID = serviceTrailID;
		this.serviceTrailName = serviceTrailName;
		this.usedTSList = usedTSList;
		this.aTP = aTP;
		this.zTP = zTP;
		this.direction = direction;
		this.psnInId = psnInId;
		this.psnOutId = psnOutId;
	}
}
