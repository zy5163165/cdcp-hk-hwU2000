package equipment;

/**
 *	Generated from IDL definition of struct "EquipmentRoom_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentRoom_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.EquipmentRoom_T value;

	public EquipmentRoom_THolder ()
	{
	}
	public EquipmentRoom_THolder(final equipment.EquipmentRoom_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return equipment.EquipmentRoom_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = equipment.EquipmentRoom_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		equipment.EquipmentRoom_THelper.write(_out, value);
	}
}
