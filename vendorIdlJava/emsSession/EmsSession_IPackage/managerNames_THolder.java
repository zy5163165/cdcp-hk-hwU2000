package emsSession.EmsSession_IPackage;

/**
 *	Generated from IDL definition of alias "managerNames_T"
 *	@author JacORB IDL compiler 
 */

public final class managerNames_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public managerNames_THolder ()
	{
	}
	public managerNames_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return managerNames_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = managerNames_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		managerNames_THelper.write (out,value);
	}
}
