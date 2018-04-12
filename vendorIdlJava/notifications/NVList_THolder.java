package notifications;

/**
 *	Generated from IDL definition of alias "NVList_T"
 *	@author JacORB IDL compiler 
 */

public final class NVList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.NameAndAnyValue_T[] value;

	public NVList_THolder ()
	{
	}
	public NVList_THolder (final notifications.NameAndAnyValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NVList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NVList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NVList_THelper.write (out,value);
	}
}
