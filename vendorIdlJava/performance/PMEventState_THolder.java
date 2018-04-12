package performance;

/**
 *	Generated from IDL definition of struct "PMEventState_T"
 *	@author JacORB IDL compiler 
 */

public final class PMEventState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMEventState_T value;

	public PMEventState_THolder ()
	{
	}
	public PMEventState_THolder(final performance.PMEventState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.PMEventState_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.PMEventState_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.PMEventState_THelper.write(_out, value);
	}
}
