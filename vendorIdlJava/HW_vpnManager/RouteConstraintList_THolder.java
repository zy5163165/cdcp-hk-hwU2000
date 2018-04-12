package HW_vpnManager;

/**
 *	Generated from IDL definition of alias "RouteConstraintList_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteConstraintList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.RouteConstraint_T[] value;

	public RouteConstraintList_THolder ()
	{
	}
	public RouteConstraintList_THolder (final HW_vpnManager.RouteConstraint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteConstraintList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteConstraintList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteConstraintList_THelper.write (out,value);
	}
}
