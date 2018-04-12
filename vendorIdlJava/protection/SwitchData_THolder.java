package protection;

/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.SwitchData_T value;

	public SwitchData_THolder ()
	{
	}
	public SwitchData_THolder(final protection.SwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return protection.SwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = protection.SwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		protection.SwitchData_THelper.write(_out, value);
	}
}
