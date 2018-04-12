package performance;

/**
 *	Generated from IDL definition of struct "HoldingTime_T"
 *	@author JacORB IDL compiler 
 */

public final class HoldingTime_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.HoldingTime_T value;

	public HoldingTime_THolder ()
	{
	}
	public HoldingTime_THolder(final performance.HoldingTime_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.HoldingTime_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.HoldingTime_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.HoldingTime_THelper.write(_out, value);
	}
}
