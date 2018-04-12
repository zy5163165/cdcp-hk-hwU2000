package protection;

/**
 *	Generated from IDL definition of alias "HW_XPICGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_XPICGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.HW_XPICGroup_T[] value;

	public HW_XPICGroupList_THolder ()
	{
	}
	public HW_XPICGroupList_THolder (final protection.HW_XPICGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_XPICGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_XPICGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_XPICGroupList_THelper.write (out,value);
	}
}
