package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "NodeType_T"
 *	@author JacORB IDL compiler 
 */

public final class NodeType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(circuitCutMgr.NodeType_THelper.id(),"NodeType_T",new String[]{"NODETYPE_ME","NODETYPE_TOPO_SN"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.NodeType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.NodeType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/NodeType_T:1.0";
	}
	public static NodeType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return NodeType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final NodeType_T s)
	{
		out.write_long(s.value());
	}
}
