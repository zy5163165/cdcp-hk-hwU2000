package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "NamingAttributesList_T"
 *	@author JacORB IDL compiler 
 */

public final class NamingAttributesList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.NameAndStringValue_T[][] value;

	public NamingAttributesList_THolder ()
	{
	}
	public NamingAttributesList_THolder (final circuitCutMgr.NameAndStringValue_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamingAttributesList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingAttributesList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamingAttributesList_THelper.write (out,value);
	}
}
