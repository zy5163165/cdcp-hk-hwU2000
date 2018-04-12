package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "PortInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class PortInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.PortInfo_T value;

	public PortInfo_THolder ()
	{
	}
	public PortInfo_THolder(final circuitCutMgr.PortInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.PortInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.PortInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.PortInfo_THelper.write(_out, value);
	}
}
