package notifications;

/**
 *	Generated from IDL definition of struct "NameAndAnyValue_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndAnyValue_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.NameAndAnyValue_T value;

	public NameAndAnyValue_THolder ()
	{
	}
	public NameAndAnyValue_THolder(final notifications.NameAndAnyValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return notifications.NameAndAnyValue_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = notifications.NameAndAnyValue_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		notifications.NameAndAnyValue_THelper.write(_out, value);
	}
}
