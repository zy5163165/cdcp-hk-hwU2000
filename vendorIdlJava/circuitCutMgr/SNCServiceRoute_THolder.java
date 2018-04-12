package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "SNCServiceRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCServiceRoute_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.SNCServiceRoute_T value;

	public SNCServiceRoute_THolder ()
	{
	}
	public SNCServiceRoute_THolder(final circuitCutMgr.SNCServiceRoute_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.SNCServiceRoute_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.SNCServiceRoute_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.SNCServiceRoute_THelper.write(_out, value);
	}
}
