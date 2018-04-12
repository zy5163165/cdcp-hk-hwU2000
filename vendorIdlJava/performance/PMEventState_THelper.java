package performance;


/**
 *	Generated from IDL definition of struct "PMEventState_T"
 *	@author JacORB IDL compiler 
 */

public final class PMEventState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(performance.PMEventState_THelper.id(),"PMEventState_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", performance.PMParameterName_THelper.type(), null),new org.omg.CORBA.StructMember("pmLocation", performance.PMLocation_THelper.type(), null),new org.omg.CORBA.StructMember("bEnableMonitor", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("bAutoReport", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.PMEventState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.PMEventState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMEventState_T:1.0";
	}
	public static performance.PMEventState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.PMEventState_T result = new performance.PMEventState_T();
		result.pmParameterName=in.read_string();
		result.pmLocation=in.read_string();
		result.bEnableMonitor=in.read_boolean();
		result.bAutoReport=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.PMEventState_T s)
	{
		out.write_string(s.pmParameterName);
		out.write_string(s.pmLocation);
		out.write_boolean(s.bEnableMonitor);
		out.write_boolean(s.bAutoReport);
	}
}
