package notifications;

/**
 *	Generated from IDL definition of struct "CorrelatedNotifications_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotifications_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.CorrelatedNotifications_T value;

	public CorrelatedNotifications_THolder ()
	{
	}
	public CorrelatedNotifications_THolder(final notifications.CorrelatedNotifications_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return notifications.CorrelatedNotifications_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = notifications.CorrelatedNotifications_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		notifications.CorrelatedNotifications_THelper.write(_out, value);
	}
}
