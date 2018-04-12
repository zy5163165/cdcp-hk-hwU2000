package emsMgr;

/**
 *	Generated from IDL definition of alias "ManagedElementTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class ManagedElementTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ManagedElementTypeList_THolder ()
	{
	}
	public ManagedElementTypeList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ManagedElementTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ManagedElementTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ManagedElementTypeList_THelper.write (out,value);
	}
}
