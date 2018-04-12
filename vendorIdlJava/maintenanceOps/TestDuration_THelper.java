package maintenanceOps;


/**
 *	Generated from IDL definition of struct "TestDuration_T"
 *	@author JacORB IDL compiler 
 */

public final class TestDuration_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(maintenanceOps.TestDuration_THelper.id(),"TestDuration_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.TestDuration_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.TestDuration_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/TestDuration_T:1.0";
	}
	public static maintenanceOps.TestDuration_T read (final org.omg.CORBA.portable.InputStream in)
	{
		maintenanceOps.TestDuration_T result = new maintenanceOps.TestDuration_T();
		result.value=in.read_ulong();
		result.unit=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final maintenanceOps.TestDuration_T s)
	{
		out.write_ulong(s.value);
		out.write_string(s.unit);
	}
}
