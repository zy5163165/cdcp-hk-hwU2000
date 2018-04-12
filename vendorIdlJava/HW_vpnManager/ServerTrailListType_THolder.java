package HW_vpnManager;

/**
 *	Generated from IDL definition of alias "ServerTrailListType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrailListType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.ServerTrailType_T[] value;

	public ServerTrailListType_THolder ()
	{
	}
	public ServerTrailListType_THolder (final HW_vpnManager.ServerTrailType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServerTrailListType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerTrailListType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServerTrailListType_THelper.write (out,value);
	}
}
