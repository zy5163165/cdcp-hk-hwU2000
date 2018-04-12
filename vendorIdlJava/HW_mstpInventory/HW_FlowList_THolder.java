package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_FlowList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_FlowList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_Flow_T[] value;

	public HW_FlowList_THolder ()
	{
	}
	public HW_FlowList_THolder (final HW_mstpInventory.HW_Flow_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_FlowList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_FlowList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_FlowList_THelper.write (out,value);
	}
}
