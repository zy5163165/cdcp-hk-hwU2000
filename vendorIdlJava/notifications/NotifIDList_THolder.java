package notifications;

/**
 *	Generated from IDL definition of alias "NotifIDList_T"
 *	@author JacORB IDL compiler 
 */

public final class NotifIDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public NotifIDList_THolder ()
	{
	}
	public NotifIDList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NotifIDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotifIDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NotifIDList_THelper.write (out,value);
	}
}
