package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "TPInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TPInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TPInfo_T(){}
	public int NEID;
	public circuitCutMgr.PortInfo_T portInfo;
	public circuitCutMgr.TimeSlotInfo_T tsInfo;
	public TPInfo_T(int NEID, circuitCutMgr.PortInfo_T portInfo, circuitCutMgr.TimeSlotInfo_T tsInfo)
	{
		this.NEID = NEID;
		this.portInfo = portInfo;
		this.tsInfo = tsInfo;
	}
}
