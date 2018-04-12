package HW_vpnManager;

/**
 *	Generated from IDL definition of alias "StaticMacAddressList_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticMacAddressList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.StaticMacAddress_T[] value;

	public StaticMacAddressList_THolder ()
	{
	}
	public StaticMacAddressList_THolder (final HW_vpnManager.StaticMacAddress_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StaticMacAddressList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StaticMacAddressList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StaticMacAddressList_THelper.write (out,value);
	}
}
