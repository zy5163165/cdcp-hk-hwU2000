package protection;

/**
 *	Generated from IDL definition of struct "IPSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class IPSwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.IPSwitchData_T value;

	public IPSwitchData_THolder ()
	{
	}
	public IPSwitchData_THolder(final protection.IPSwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return protection.IPSwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = protection.IPSwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		protection.IPSwitchData_THelper.write(_out, value);
	}
}
