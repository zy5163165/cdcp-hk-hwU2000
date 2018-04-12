package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ErrorReasonList_T"
 *	@author JacORB IDL compiler 
 */

public final class ErrorReasonList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ErrorReason_T[] value;

	public ErrorReasonList_THolder ()
	{
	}
	public ErrorReasonList_THolder (final circuitCutMgr.ErrorReason_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ErrorReasonList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ErrorReasonList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ErrorReasonList_THelper.write (out,value);
	}
}
