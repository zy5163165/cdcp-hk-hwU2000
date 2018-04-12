package notifications;


/**
 *	Generated from IDL definition of struct "CorrelatedNotifications_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotifications_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(notifications.CorrelatedNotifications_THelper.id(),"CorrelatedNotifications_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("source", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("notifIDs", notifications.NotifIDList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final notifications.CorrelatedNotifications_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.CorrelatedNotifications_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/CorrelatedNotifications_T:1.0";
	}
	public static notifications.CorrelatedNotifications_T read (final org.omg.CORBA.portable.InputStream in)
	{
		notifications.CorrelatedNotifications_T result = new notifications.CorrelatedNotifications_T();
		result.source = globaldefs.NVSList_THelper.read(in);
		result.notifIDs = notifications.NotifIDList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final notifications.CorrelatedNotifications_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.source);
		notifications.NotifIDList_THelper.write(out,s.notifIDs);
	}
}
