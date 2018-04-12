package equipment;


/**
 *	Generated from IDL definition of struct "EQTCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class EQTCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.EQTCreateData_THelper.id(),"EQTCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("expectedEquipmentObjectType", equipment.EquipmentObjectType_THelper.type(), null),new org.omg.CORBA.StructMember("equipmentHolderName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.EQTCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.EQTCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/EQTCreateData_T:1.0";
	}
	public static equipment.EQTCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.EQTCreateData_T result = new equipment.EQTCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.expectedEquipmentObjectType=in.read_string();
		result.equipmentHolderName = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.EQTCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.expectedEquipmentObjectType);
		globaldefs.NVSList_THelper.write(out,s.equipmentHolderName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
