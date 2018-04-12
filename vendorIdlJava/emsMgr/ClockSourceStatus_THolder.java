package emsMgr;

/**
 *	Generated from IDL definition of struct "ClockSourceStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockSourceStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.ClockSourceStatus_T value;

	public ClockSourceStatus_THolder ()
	{
	}
	public ClockSourceStatus_THolder(final emsMgr.ClockSourceStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.ClockSourceStatus_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.ClockSourceStatus_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.ClockSourceStatus_THelper.write(_out, value);
	}
}
