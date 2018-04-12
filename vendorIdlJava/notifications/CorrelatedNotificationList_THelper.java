package notifications;

/**
 *	Generated from IDL definition of alias "CorrelatedNotificationList_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotificationList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, notifications.CorrelatedNotifications_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static notifications.CorrelatedNotifications_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(notifications.CorrelatedNotificationList_THelper.id(), "CorrelatedNotificationList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, notifications.CorrelatedNotifications_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/CorrelatedNotificationList_T:1.0";
	}
	public static notifications.CorrelatedNotifications_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		notifications.CorrelatedNotifications_T[] _result;
		int _l_result97 = _in.read_long();
		_result = new notifications.CorrelatedNotifications_T[_l_result97];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=notifications.CorrelatedNotifications_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, notifications.CorrelatedNotifications_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			notifications.CorrelatedNotifications_THelper.write(_out,_s[i]);
		}

	}
}
