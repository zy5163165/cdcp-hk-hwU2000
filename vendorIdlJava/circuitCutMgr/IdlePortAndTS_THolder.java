package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "IdlePortAndTS_T"
 *	@author JacORB IDL compiler 
 */

public final class IdlePortAndTS_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.IdlePortAndTS_T value;

	public IdlePortAndTS_THolder ()
	{
	}
	public IdlePortAndTS_THolder(final circuitCutMgr.IdlePortAndTS_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.IdlePortAndTS_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.IdlePortAndTS_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.IdlePortAndTS_THelper.write(_out, value);
	}
}
