package equipment;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class EquipmentInventoryMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EquipmentInventoryMgr_I value;
	public EquipmentInventoryMgr_IHolder()
	{
	}
	public EquipmentInventoryMgr_IHolder (final EquipmentInventoryMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EquipmentInventoryMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentInventoryMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EquipmentInventoryMgr_IHelper.write (_out,value);
	}
}
