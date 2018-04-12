package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "SNCRate_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCRate_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public SNCRate_T value;

	public SNCRate_THolder ()
	{
	}
	public SNCRate_THolder (final SNCRate_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCRate_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCRate_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCRate_THelper.write (out,value);
	}
}
