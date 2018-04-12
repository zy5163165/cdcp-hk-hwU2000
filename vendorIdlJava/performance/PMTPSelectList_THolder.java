package performance;

/**
 *	Generated from IDL definition of alias "PMTPSelectList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPSelectList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMTPSelect_T[] value;

	public PMTPSelectList_THolder ()
	{
	}
	public PMTPSelectList_THolder (final performance.PMTPSelect_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMTPSelectList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMTPSelectList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMTPSelectList_THelper.write (out,value);
	}
}
