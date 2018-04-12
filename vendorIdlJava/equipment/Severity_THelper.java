package equipment;


/**
 *	Generated from IDL definition of struct "Severity_T"
 *	@author JacORB IDL compiler 
 */

public final class Severity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.Severity_THelper.id(),"Severity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("probableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("currentSeverity", notifications.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("eqtType", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.Severity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.Severity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/Severity_T:1.0";
	}
	public static equipment.Severity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.Severity_T result = new equipment.Severity_T();
		result.probableCause=in.read_string();
		result.currentSeverity=notifications.PerceivedSeverity_THelper.read(in);
		result.alarmID=in.read_long();
		result.eqtType=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.Severity_T s)
	{
		out.write_string(s.probableCause);
		notifications.PerceivedSeverity_THelper.write(out,s.currentSeverity);
		out.write_long(s.alarmID);
		out.write_long(s.eqtType);
	}
}
