package notifications;

/**
 *	Generated from IDL definition of alias "EventList_T"
 *	@author JacORB IDL compiler 
 */

public final class EventList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.StructuredEvent[] value;

	public EventList_THolder ()
	{
	}
	public EventList_THolder (final org.omg.CosNotification.StructuredEvent[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EventList_THelper.write (out,value);
	}
}
