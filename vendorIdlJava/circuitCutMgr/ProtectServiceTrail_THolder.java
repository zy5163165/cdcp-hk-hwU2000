package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ProtectServiceTrail_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectServiceTrail_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ProtectServiceTrail_T value;

	public ProtectServiceTrail_THolder ()
	{
	}
	public ProtectServiceTrail_THolder(final circuitCutMgr.ProtectServiceTrail_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.ProtectServiceTrail_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.ProtectServiceTrail_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.ProtectServiceTrail_THelper.write(_out, value);
	}
}
