package TopoManagementManager;
/**
 *	Generated from IDL definition of enum "NodeType_T"
 *	@author JacORB IDL compiler 
 */

public final class NodeType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public NodeType_T value;

	public NodeType_THolder ()
	{
	}
	public NodeType_THolder (final NodeType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NodeType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NodeType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NodeType_THelper.write (out,value);
	}
}
