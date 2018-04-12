package notifications;
/**
 *	Generated from IDL definition of enum "ServiceAffecting_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceAffecting_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(notifications.ServiceAffecting_THelper.id(),"ServiceAffecting_T",new String[]{"SA_UNKNOWN","SA_SERVICE_AFFECTING","SA_NON_SERVICE_AFFECTING"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final notifications.ServiceAffecting_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.ServiceAffecting_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/ServiceAffecting_T:1.0";
	}
	public static ServiceAffecting_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ServiceAffecting_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ServiceAffecting_T s)
	{
		out.write_long(s.value());
	}
}
