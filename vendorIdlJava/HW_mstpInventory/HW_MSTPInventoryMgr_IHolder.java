package HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_MSTPInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_MSTPInventoryMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MSTPInventoryMgr_I value;
	public HW_MSTPInventoryMgr_IHolder()
	{
	}
	public HW_MSTPInventoryMgr_IHolder (final HW_MSTPInventoryMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MSTPInventoryMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MSTPInventoryMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MSTPInventoryMgr_IHelper.write (_out,value);
	}
}
