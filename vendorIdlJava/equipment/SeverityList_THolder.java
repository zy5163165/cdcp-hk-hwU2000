package equipment;

/**
 *	Generated from IDL definition of alias "SeverityList_T"
 *	@author JacORB IDL compiler 
 */

public final class SeverityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.Severity_T[] value;

	public SeverityList_THolder ()
	{
	}
	public SeverityList_THolder (final equipment.Severity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SeverityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SeverityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SeverityList_THelper.write (out,value);
	}
}
