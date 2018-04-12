package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ProtectServiceTrail_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectServiceTrail_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProtectServiceTrail_T(){}
	public circuitCutMgr.TPInfo_T aEndTP;
	public circuitCutMgr.TPInfo_T zEndTP;
	public circuitCutMgr.ServiceTrail_T[] route;
	public ProtectServiceTrail_T(circuitCutMgr.TPInfo_T aEndTP, circuitCutMgr.TPInfo_T zEndTP, circuitCutMgr.ServiceTrail_T[] route)
	{
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.route = route;
	}
}
