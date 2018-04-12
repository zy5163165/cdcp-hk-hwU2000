package flowDomain;

/**
 *	Generated from IDL definition of alias "ParameterGroupsList_T"
 *	@author JacORB IDL compiler 
 */

public final class ParameterGroupsList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ParameterGroupsList_THolder ()
	{
	}
	public ParameterGroupsList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ParameterGroupsList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ParameterGroupsList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ParameterGroupsList_THelper.write (out,value);
	}
}
