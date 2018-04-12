package equipment;

/**
 *	Generated from IDL definition of struct "EquipmentHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentHolder_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.EquipmentHolder_T value;

	public EquipmentHolder_THolder ()
	{
	}
	public EquipmentHolder_THolder(final equipment.EquipmentHolder_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return equipment.EquipmentHolder_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = equipment.EquipmentHolder_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		equipment.EquipmentHolder_THelper.write(_out, value);
	}
}
