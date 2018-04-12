package transmissionParameters;

/**
 *	Generated from IDL definition of struct "LayeredParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredParameters_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public transmissionParameters.LayeredParameters_T value;

	public LayeredParameters_THolder ()
	{
	}
	public LayeredParameters_THolder(final transmissionParameters.LayeredParameters_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return transmissionParameters.LayeredParameters_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = transmissionParameters.LayeredParameters_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		transmissionParameters.LayeredParameters_THelper.write(_out, value);
	}
}
