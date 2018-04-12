package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "RouteInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteInfo_T[] value;

	public RouteInfoList_THolder ()
	{
	}
	public RouteInfoList_THolder (final subnetworkConnection.RouteInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteInfoList_THelper.write (out,value);
	}
}
