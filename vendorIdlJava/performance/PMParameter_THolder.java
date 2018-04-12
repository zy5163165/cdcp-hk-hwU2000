package performance;

/**
 *	Generated from IDL definition of struct "PMParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameter_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMParameter_T value;

	public PMParameter_THolder ()
	{
	}
	public PMParameter_THolder(final performance.PMParameter_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.PMParameter_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.PMParameter_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.PMParameter_THelper.write(_out, value);
	}
}
