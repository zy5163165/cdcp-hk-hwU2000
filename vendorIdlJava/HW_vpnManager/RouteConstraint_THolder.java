package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "RouteConstraint_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteConstraint_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.RouteConstraint_T value;

	public RouteConstraint_THolder ()
	{
	}
	public RouteConstraint_THolder(final HW_vpnManager.RouteConstraint_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.RouteConstraint_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.RouteConstraint_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.RouteConstraint_THelper.write(_out, value);
	}
}
