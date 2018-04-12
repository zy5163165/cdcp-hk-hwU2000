package HW_vpnManager;

/**
 *	Generated from IDL definition of alias "IPCrossConnectionList_T"
 *	@author JacORB IDL compiler 
 */

public final class IPCrossConnectionList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.IPCrossConnection_T[] value;

	public IPCrossConnectionList_THolder ()
	{
	}
	public IPCrossConnectionList_THolder (final HW_vpnManager.IPCrossConnection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IPCrossConnectionList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPCrossConnectionList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IPCrossConnectionList_THelper.write (out,value);
	}
}
