package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ErrorReason_T"
 *	@author JacORB IDL compiler 
 */

public final class ErrorReason_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ErrorReason_T value;

	public ErrorReason_THolder ()
	{
	}
	public ErrorReason_THolder(final circuitCutMgr.ErrorReason_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.ErrorReason_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.ErrorReason_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.ErrorReason_THelper.write(_out, value);
	}
}
