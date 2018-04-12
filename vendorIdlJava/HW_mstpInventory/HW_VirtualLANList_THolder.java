package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_VirtualLANList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_VirtualLANList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_VirtualLAN_T[] value;

	public HW_VirtualLANList_THolder ()
	{
	}
	public HW_VirtualLANList_THolder (final HW_mstpInventory.HW_VirtualLAN_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_VirtualLANList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_VirtualLANList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_VirtualLANList_THelper.write (out,value);
	}
}
