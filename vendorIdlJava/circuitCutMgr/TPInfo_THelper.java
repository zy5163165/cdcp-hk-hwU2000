package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "TPInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TPInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("portInfo", circuitCutMgr.PortInfo_THelper.type(), null),new org.omg.CORBA.StructMember("tsInfo", circuitCutMgr.TimeSlotInfo_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.TPInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.TPInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/TPInfo_T:1.0";
	}
	public static circuitCutMgr.TPInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.TPInfo_T result = new circuitCutMgr.TPInfo_T();
		result.NEID=in.read_ulong();
		result.portInfo=circuitCutMgr.PortInfo_THelper.read(in);
		result.tsInfo=circuitCutMgr.TimeSlotInfo_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.TPInfo_T s)
	{
		out.write_ulong(s.NEID);
		circuitCutMgr.PortInfo_THelper.write(out,s.portInfo);
		circuitCutMgr.TimeSlotInfo_THelper.write(out,s.tsInfo);
	}
}
