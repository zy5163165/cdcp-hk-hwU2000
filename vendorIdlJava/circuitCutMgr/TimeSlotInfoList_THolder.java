package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "TimeSlotInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class TimeSlotInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.TimeSlotInfo_T[] value;

	public TimeSlotInfoList_THolder ()
	{
	}
	public TimeSlotInfoList_THolder (final circuitCutMgr.TimeSlotInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TimeSlotInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TimeSlotInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TimeSlotInfoList_THelper.write (out,value);
	}
}
