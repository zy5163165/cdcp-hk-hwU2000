package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ConnectivityNodePair_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityNodePair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ConnectivityNodePair_T value;

	public ConnectivityNodePair_THolder ()
	{
	}
	public ConnectivityNodePair_THolder(final circuitCutMgr.ConnectivityNodePair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.ConnectivityNodePair_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.ConnectivityNodePair_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.ConnectivityNodePair_THelper.write(_out, value);
	}
}
