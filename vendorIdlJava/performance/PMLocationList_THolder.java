package performance;

/**
 *	Generated from IDL definition of alias "PMLocationList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMLocationList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public PMLocationList_THolder ()
	{
	}
	public PMLocationList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMLocationList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMLocationList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMLocationList_THelper.write (out,value);
	}
}
