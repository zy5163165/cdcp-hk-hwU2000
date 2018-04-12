package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "RouteList_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteDescriptor_T[] value;

	public RouteList_THolder ()
	{
	}
	public RouteList_THolder (final subnetworkConnection.RouteDescriptor_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteList_THelper.write (out,value);
	}
}
