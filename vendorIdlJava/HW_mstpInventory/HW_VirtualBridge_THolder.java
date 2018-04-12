package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_VirtualBridge_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_VirtualBridge_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_VirtualBridge_T value;

	public HW_VirtualBridge_THolder ()
	{
	}
	public HW_VirtualBridge_THolder(final HW_mstpInventory.HW_VirtualBridge_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_mstpInventory.HW_VirtualBridge_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_mstpInventory.HW_VirtualBridge_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_mstpInventory.HW_VirtualBridge_THelper.write(_out, value);
	}
}
