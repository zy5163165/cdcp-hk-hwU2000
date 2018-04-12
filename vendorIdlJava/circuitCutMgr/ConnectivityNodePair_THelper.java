package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "ConnectivityNodePair_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityNodePair_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.ConnectivityNodePair_THelper.id(),"ConnectivityNodePair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("aEnd", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("zEnd", circuitCutMgr.ObjectIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.ConnectivityNodePair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.ConnectivityNodePair_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ConnectivityNodePair_T:1.0";
	}
	public static circuitCutMgr.ConnectivityNodePair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.ConnectivityNodePair_T result = new circuitCutMgr.ConnectivityNodePair_T();
		result.aEnd=in.read_ulong();
		result.zEnd=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.ConnectivityNodePair_T s)
	{
		out.write_ulong(s.aEnd);
		out.write_ulong(s.zEnd);
	}
}
