package performance;

/**
 *	Generated from IDL definition of alias "PMStateList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMStateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMState_T[] value;

	public PMStateList_THolder ()
	{
	}
	public PMStateList_THolder (final performance.PMState_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMStateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMStateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMStateList_THelper.write (out,value);
	}
}
