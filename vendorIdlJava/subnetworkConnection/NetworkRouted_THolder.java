package subnetworkConnection;
/**
 *	Generated from IDL definition of enum "NetworkRouted_T"
 *	@author JacORB IDL compiler 
 */

public final class NetworkRouted_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public NetworkRouted_T value;

	public NetworkRouted_THolder ()
	{
	}
	public NetworkRouted_THolder (final NetworkRouted_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NetworkRouted_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NetworkRouted_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NetworkRouted_THelper.write (out,value);
	}
}
