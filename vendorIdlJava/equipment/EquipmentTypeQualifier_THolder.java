package equipment;
/**
 *	Generated from IDL definition of enum "EquipmentTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentTypeQualifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EquipmentTypeQualifier_T value;

	public EquipmentTypeQualifier_THolder ()
	{
	}
	public EquipmentTypeQualifier_THolder (final EquipmentTypeQualifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EquipmentTypeQualifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentTypeQualifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EquipmentTypeQualifier_THelper.write (out,value);
	}
}
