package circuitCutMgr;

/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ProcessingFailureException value;

	public ProcessingFailureExceptionHolder ()
	{
	}
	public ProcessingFailureExceptionHolder(final circuitCutMgr.ProcessingFailureException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.ProcessingFailureExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.ProcessingFailureExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, value);
	}
}
