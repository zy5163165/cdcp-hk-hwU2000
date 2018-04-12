package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "SNCTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCTypeQualifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public SNCTypeQualifier_T value;

	public SNCTypeQualifier_THolder ()
	{
	}
	public SNCTypeQualifier_THolder (final SNCTypeQualifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCTypeQualifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCTypeQualifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCTypeQualifier_THelper.write (out,value);
	}
}
