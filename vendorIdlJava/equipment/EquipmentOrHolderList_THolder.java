package equipment;

/**
 *	Generated from IDL definition of alias "EquipmentOrHolderList_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentOrHolderList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.EquipmentOrHolder_T[] value;

	public EquipmentOrHolderList_THolder ()
	{
	}
	public EquipmentOrHolderList_THolder (final equipment.EquipmentOrHolder_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EquipmentOrHolderList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentOrHolderList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EquipmentOrHolderList_THelper.write (out,value);
	}
}
