package notifications;

/**
 *	Generated from IDL definition of alias "PerceivedSeverityList_T"
 *	@author JacORB IDL compiler 
 */

public final class PerceivedSeverityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.PerceivedSeverity_T[] value;

	public PerceivedSeverityList_THolder ()
	{
	}
	public PerceivedSeverityList_THolder (final notifications.PerceivedSeverity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerceivedSeverityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerceivedSeverityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerceivedSeverityList_THelper.write (out,value);
	}
}
