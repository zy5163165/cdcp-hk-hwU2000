package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "Node_T"
 *	@author JacORB IDL compiler 
 */

public final class Node_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.Node_THelper.id(),"Node_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nodeID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nodeType", circuitCutMgr.NodeType_THelper.type(), null),new org.omg.CORBA.StructMember("position", circuitCutMgr.Position_THelper.type(), null),new org.omg.CORBA.StructMember("parent", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", circuitCutMgr.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.Node_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.Node_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/Node_T:1.0";
	}
	public static circuitCutMgr.Node_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.Node_T result = new circuitCutMgr.Node_T();
		result.nodeID=in.read_ulong();
		result.nativeEMSName=in.read_string();
		result.nodeType=circuitCutMgr.NodeType_THelper.read(in);
		result.position=circuitCutMgr.Position_THelper.read(in);
		result.parent=in.read_ulong();
		result.additionalInfo = circuitCutMgr.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.Node_T s)
	{
		out.write_ulong(s.nodeID);
		out.write_string(s.nativeEMSName);
		circuitCutMgr.NodeType_THelper.write(out,s.nodeType);
		circuitCutMgr.Position_THelper.write(out,s.position);
		out.write_ulong(s.parent);
		circuitCutMgr.NVSList_THelper.write(out,s.additionalInfo);
	}
}
