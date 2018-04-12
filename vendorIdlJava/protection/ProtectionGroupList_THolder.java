package protection;

/**
 *	Generated from IDL definition of alias "ProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.ProtectionGroup_T[] value;

	public ProtectionGroupList_THolder ()
	{
	}
	public ProtectionGroupList_THolder (final protection.ProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionGroupList_THelper.write (out,value);
	}
}
