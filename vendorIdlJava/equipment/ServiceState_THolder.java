package equipment;
/**
 *	Generated from IDL definition of enum "ServiceState_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ServiceState_T value;

	public ServiceState_THolder ()
	{
	}
	public ServiceState_THolder (final ServiceState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceState_THelper.write (out,value);
	}
}
