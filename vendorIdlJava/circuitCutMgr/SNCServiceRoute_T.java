package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "SNCServiceRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCServiceRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCServiceRoute_T(){}
	public circuitCutMgr.ServiceTrail_T[] positiveRouteWork;
	public circuitCutMgr.ServiceTrail_T[] oppositeRouteWork;
	public circuitCutMgr.ProtectServiceTrail_T[] positiveRouteProtection;
	public circuitCutMgr.ProtectServiceTrail_T[] oppositeRouteProtection;
	public SNCServiceRoute_T(circuitCutMgr.ServiceTrail_T[] positiveRouteWork, circuitCutMgr.ServiceTrail_T[] oppositeRouteWork, circuitCutMgr.ProtectServiceTrail_T[] positiveRouteProtection, circuitCutMgr.ProtectServiceTrail_T[] oppositeRouteProtection)
	{
		this.positiveRouteWork = positiveRouteWork;
		this.oppositeRouteWork = oppositeRouteWork;
		this.positiveRouteProtection = positiveRouteProtection;
		this.oppositeRouteProtection = oppositeRouteProtection;
	}
}
