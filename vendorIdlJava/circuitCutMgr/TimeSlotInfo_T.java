package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "TimeSlotInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TimeSlotInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TimeSlotInfo_T(){}
	public int vc4No;
	public int[] timeslots;
	public TimeSlotInfo_T(int vc4No, int[] timeslots)
	{
		this.vc4No = vc4No;
		this.timeslots = timeslots;
	}
}
