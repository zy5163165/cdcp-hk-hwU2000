package equipment;


/**
 *	Generated from IDL definition of struct "EquipmentRoom_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentRoom_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.EquipmentRoom_THelper.id(),"EquipmentRoom_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containedCabinet", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containedNMManager", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("country", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("province", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("city", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("site", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("location", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("cableArrange", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("defendStaticFloor", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("floorHeight", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("memo", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.EquipmentRoom_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.EquipmentRoom_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/EquipmentRoom_T:1.0";
	}
	public static equipment.EquipmentRoom_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.EquipmentRoom_T result = new equipment.EquipmentRoom_T();
		result.name=in.read_string();
		result.containedCabinet=in.read_string();
		result.containedNMManager=in.read_string();
		result.country=in.read_string();
		result.province=in.read_string();
		result.city=in.read_string();
		result.site=in.read_string();
		result.location=in.read_string();
		result.cableArrange=in.read_string();
		result.defendStaticFloor=in.read_string();
		result.floorHeight=in.read_ushort();
		result.memo=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.EquipmentRoom_T s)
	{
		out.write_string(s.name);
		out.write_string(s.containedCabinet);
		out.write_string(s.containedNMManager);
		out.write_string(s.country);
		out.write_string(s.province);
		out.write_string(s.city);
		out.write_string(s.site);
		out.write_string(s.location);
		out.write_string(s.cableArrange);
		out.write_string(s.defendStaticFloor);
		out.write_ushort(s.floorHeight);
		out.write_string(s.memo);
	}
}
