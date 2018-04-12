package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteInfo_T value;

	public RouteInfo_THolder ()
	{
	}
	public RouteInfo_THolder(final subnetworkConnection.RouteInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.RouteInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.RouteInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.RouteInfo_THelper.write(_out, value);
	}
}
