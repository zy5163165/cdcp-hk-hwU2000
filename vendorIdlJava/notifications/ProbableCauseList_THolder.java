package notifications;

/**
 *	Generated from IDL definition of alias "ProbableCauseList_T"
 *	@author JacORB IDL compiler 
 */

public final class ProbableCauseList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ProbableCauseList_THolder ()
	{
	}
	public ProbableCauseList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProbableCauseList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProbableCauseList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProbableCauseList_THelper.write (out,value);
	}
}
