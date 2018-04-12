package equipment;

/**
 *	Generated from IDL definition of struct "Severity_T"
 *	@author JacORB IDL compiler 
 */

public final class Severity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.Severity_T value;

	public Severity_THolder ()
	{
	}
	public Severity_THolder(final equipment.Severity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return equipment.Severity_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = equipment.Severity_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		equipment.Severity_THelper.write(_out, value);
	}
}
