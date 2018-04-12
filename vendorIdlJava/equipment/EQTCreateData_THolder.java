package equipment;

/**
 *	Generated from IDL definition of struct "EQTCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class EQTCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.EQTCreateData_T value;

	public EQTCreateData_THolder ()
	{
	}
	public EQTCreateData_THolder(final equipment.EQTCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return equipment.EQTCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = equipment.EQTCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		equipment.EQTCreateData_THelper.write(_out, value);
	}
}
