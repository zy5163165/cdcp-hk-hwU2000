package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "ServerTrailType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrailType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.ServerTrailType_T value;

	public ServerTrailType_THolder ()
	{
	}
	public ServerTrailType_THolder(final HW_vpnManager.ServerTrailType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.ServerTrailType_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.ServerTrailType_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.ServerTrailType_THelper.write(_out, value);
	}
}
