package protection;

/**
 *	Generated from IDL definition of struct "WDMSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMSwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.WDMSwitchData_T value;

	public WDMSwitchData_THolder ()
	{
	}
	public WDMSwitchData_THolder(final protection.WDMSwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return protection.WDMSwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = protection.WDMSwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		protection.WDMSwitchData_THelper.write(_out, value);
	}
}
