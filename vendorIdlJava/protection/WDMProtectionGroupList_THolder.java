package protection;

/**
 *	Generated from IDL definition of alias "WDMProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.WDMProtectionGroup_T[] value;

	public WDMProtectionGroupList_THolder ()
	{
	}
	public WDMProtectionGroupList_THolder (final protection.WDMProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WDMProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WDMProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WDMProtectionGroupList_THelper.write (out,value);
	}
}
