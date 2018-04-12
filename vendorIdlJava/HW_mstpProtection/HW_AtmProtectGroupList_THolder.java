package HW_mstpProtection;

/**
 *	Generated from IDL definition of alias "HW_AtmProtectGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmProtectGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpProtection.HW_AtmProtectGroup_T[] value;

	public HW_AtmProtectGroupList_THolder ()
	{
	}
	public HW_AtmProtectGroupList_THolder (final HW_mstpProtection.HW_AtmProtectGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmProtectGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmProtectGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmProtectGroupList_THelper.write (out,value);
	}
}
