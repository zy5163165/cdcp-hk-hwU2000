package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "TimeSlotInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TimeSlotInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.TimeSlotInfo_T value;

	public TimeSlotInfo_THolder ()
	{
	}
	public TimeSlotInfo_THolder(final circuitCutMgr.TimeSlotInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.TimeSlotInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.TimeSlotInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.TimeSlotInfo_THelper.write(_out, value);
	}
}
