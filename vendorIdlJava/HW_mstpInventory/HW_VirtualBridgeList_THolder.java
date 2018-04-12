package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_VirtualBridgeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_VirtualBridgeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_VirtualBridge_T[] value;

	public HW_VirtualBridgeList_THolder ()
	{
	}
	public HW_VirtualBridgeList_THolder (final HW_mstpInventory.HW_VirtualBridge_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_VirtualBridgeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_VirtualBridgeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_VirtualBridgeList_THelper.write (out,value);
	}
}
