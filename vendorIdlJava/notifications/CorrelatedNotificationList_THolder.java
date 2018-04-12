package notifications;

/**
 *	Generated from IDL definition of alias "CorrelatedNotificationList_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotificationList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.CorrelatedNotifications_T[] value;

	public CorrelatedNotificationList_THolder ()
	{
	}
	public CorrelatedNotificationList_THolder (final notifications.CorrelatedNotifications_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CorrelatedNotificationList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CorrelatedNotificationList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CorrelatedNotificationList_THelper.write (out,value);
	}
}
