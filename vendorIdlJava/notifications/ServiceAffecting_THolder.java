package notifications;
/**
 *	Generated from IDL definition of enum "ServiceAffecting_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceAffecting_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ServiceAffecting_T value;

	public ServiceAffecting_THolder ()
	{
	}
	public ServiceAffecting_THolder (final ServiceAffecting_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceAffecting_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceAffecting_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceAffecting_THelper.write (out,value);
	}
}
