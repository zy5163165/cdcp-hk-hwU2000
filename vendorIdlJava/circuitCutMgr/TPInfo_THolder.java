package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "TPInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TPInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.TPInfo_T value;

	public TPInfo_THolder ()
	{
	}
	public TPInfo_THolder(final circuitCutMgr.TPInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.TPInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.TPInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.TPInfo_THelper.write(_out, value);
	}
}
