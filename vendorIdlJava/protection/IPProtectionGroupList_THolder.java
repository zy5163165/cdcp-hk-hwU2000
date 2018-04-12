package protection;

/**
 *	Generated from IDL definition of alias "IPProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class IPProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.IPProtectionGroup_T[] value;

	public IPProtectionGroupList_THolder ()
	{
	}
	public IPProtectionGroupList_THolder (final protection.IPProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IPProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IPProtectionGroupList_THelper.write (out,value);
	}
}
