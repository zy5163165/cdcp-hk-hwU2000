package transmissionParameters;

/**
 *	Generated from IDL definition of alias "LayeredParameterList_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredParameterList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public transmissionParameters.LayeredParameters_T[] value;

	public LayeredParameterList_THolder ()
	{
	}
	public LayeredParameterList_THolder (final transmissionParameters.LayeredParameters_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LayeredParameterList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LayeredParameterList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LayeredParameterList_THelper.write (out,value);
	}
}
