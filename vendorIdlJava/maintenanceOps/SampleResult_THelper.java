package maintenanceOps;


/**
 *	Generated from IDL definition of struct "SampleResult_T"
 *	@author JacORB IDL compiler 
 */

public final class SampleResult_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(maintenanceOps.SampleResult_THelper.id(),"SampleResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sampleTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.SampleResult_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.SampleResult_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/SampleResult_T:1.0";
	}
	public static maintenanceOps.SampleResult_T read (final org.omg.CORBA.portable.InputStream in)
	{
		maintenanceOps.SampleResult_T result = new maintenanceOps.SampleResult_T();
		result.sampleTime=in.read_string();
		result.value=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final maintenanceOps.SampleResult_T s)
	{
		out.write_string(s.sampleTime);
		out.write_ulong(s.value);
	}
}
