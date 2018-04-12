package protection;

/**
 *	Generated from IDL definition of alias "HW_ERPSProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ERPSProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.HW_ERPSProtectionGroup_T[] value;

	public HW_ERPSProtectionGroupList_THolder ()
	{
	}
	public HW_ERPSProtectionGroupList_THolder (final protection.HW_ERPSProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_ERPSProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_ERPSProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_ERPSProtectionGroupList_THelper.write (out,value);
	}
}
