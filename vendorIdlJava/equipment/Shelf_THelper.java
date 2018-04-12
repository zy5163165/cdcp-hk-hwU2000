package equipment;


/**
 *	Generated from IDL definition of struct "Shelf_T"
 *	@author JacORB IDL compiler 
 */

public final class Shelf_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.Shelf_THelper.id(),"Shelf_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("equipmentRoomName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("cabinetName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("numbering", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("locationOfCabinet", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("memo", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.Shelf_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.Shelf_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/Shelf_T:1.0";
	}
	public static equipment.Shelf_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.Shelf_T result = new equipment.Shelf_T();
		result.name=in.read_string();
		result.equipmentRoomName=in.read_string();
		result.cabinetName=in.read_string();
		result.numbering=in.read_string();
		result.locationOfCabinet=in.read_string();
		result.memo=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.Shelf_T s)
	{
		out.write_string(s.name);
		out.write_string(s.equipmentRoomName);
		out.write_string(s.cabinetName);
		out.write_string(s.numbering);
		out.write_string(s.locationOfCabinet);
		out.write_string(s.memo);
	}
}
