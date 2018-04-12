package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "NodeList_T"
 *	@author JacORB IDL compiler 
 */

public final class NodeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.Node_T[] value;

	public NodeList_THolder ()
	{
	}
	public NodeList_THolder (final circuitCutMgr.Node_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NodeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NodeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NodeList_THelper.write (out,value);
	}
}
