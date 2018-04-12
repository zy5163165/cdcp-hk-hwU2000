package performance;

/**
 *	Generated from IDL definition of struct "PMTPSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPSelect_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMTPSelect_T value;

	public PMTPSelect_THolder ()
	{
	}
	public PMTPSelect_THolder(final performance.PMTPSelect_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.PMTPSelect_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.PMTPSelect_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.PMTPSelect_THelper.write(_out, value);
	}
}
