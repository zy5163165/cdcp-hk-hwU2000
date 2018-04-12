package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ConnectivityNodePairList_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityNodePairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ConnectivityNodePair_T[] value;

	public ConnectivityNodePairList_THolder ()
	{
	}
	public ConnectivityNodePairList_THolder (final circuitCutMgr.ConnectivityNodePair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConnectivityNodePairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectivityNodePairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConnectivityNodePairList_THelper.write (out,value);
	}
}
