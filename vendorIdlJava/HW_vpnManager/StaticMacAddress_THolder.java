package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "StaticMacAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticMacAddress_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.StaticMacAddress_T value;

	public StaticMacAddress_THolder ()
	{
	}
	public StaticMacAddress_THolder(final HW_vpnManager.StaticMacAddress_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.StaticMacAddress_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.StaticMacAddress_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.StaticMacAddress_THelper.write(_out, value);
	}
}
