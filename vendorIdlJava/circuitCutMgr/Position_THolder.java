package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "Position_T"
 *	@author JacORB IDL compiler 
 */

public final class Position_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.Position_T value;

	public Position_THolder ()
	{
	}
	public Position_THolder(final circuitCutMgr.Position_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.Position_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.Position_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.Position_THelper.write(_out, value);
	}
}
