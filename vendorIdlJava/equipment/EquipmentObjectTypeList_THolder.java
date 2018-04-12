package equipment;

/**
 *	Generated from IDL definition of alias "EquipmentObjectTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentObjectTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public EquipmentObjectTypeList_THolder ()
	{
	}
	public EquipmentObjectTypeList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EquipmentObjectTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentObjectTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EquipmentObjectTypeList_THelper.write (out,value);
	}
}
