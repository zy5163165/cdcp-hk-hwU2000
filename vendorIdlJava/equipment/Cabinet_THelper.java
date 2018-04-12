package equipment;


/**
 *	Generated from IDL definition of struct "Cabinet_T"
 *	@author JacORB IDL compiler 
 */

public final class Cabinet_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.Cabinet_THelper.id(),"Cabinet_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("equipmentRoomName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containedShelfList", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("height", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("width", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("depth", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("voltage", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("powerBoxType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("memo", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.Cabinet_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.Cabinet_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/Cabinet_T:1.0";
	}
	public static equipment.Cabinet_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.Cabinet_T result = new equipment.Cabinet_T();
		result.name=in.read_string();
		result.equipmentRoomName=in.read_string();
		result.containedShelfList=in.read_string();
		result.type=in.read_string();
		result.height=in.read_ushort();
		result.width=in.read_ushort();
		result.depth=in.read_ushort();
		result.voltage=in.read_long();
		result.powerBoxType=in.read_string();
		result.memo=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.Cabinet_T s)
	{
		out.write_string(s.name);
		out.write_string(s.equipmentRoomName);
		out.write_string(s.containedShelfList);
		out.write_string(s.type);
		out.write_ushort(s.height);
		out.write_ushort(s.width);
		out.write_ushort(s.depth);
		out.write_long(s.voltage);
		out.write_string(s.powerBoxType);
		out.write_string(s.memo);
	}
}
