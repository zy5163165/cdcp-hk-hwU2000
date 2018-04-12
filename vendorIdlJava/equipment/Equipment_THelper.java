package equipment;


/**
 *	Generated from IDL definition of struct "Equipment_T"
 *	@author JacORB IDL compiler 
 */

public final class Equipment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.Equipment_THelper.id(),"Equipment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("alarmReportingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("serviceState", equipment.ServiceState_THelper.type(), null),new org.omg.CORBA.StructMember("expectedEquipmentObjectType", equipment.EquipmentObjectType_THelper.type(), null),new org.omg.CORBA.StructMember("installedEquipmentObjectType", equipment.EquipmentObjectType_THelper.type(), null),new org.omg.CORBA.StructMember("installedPartNumber", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("installedVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("installedSerialNumber", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.Equipment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.Equipment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/Equipment_T:1.0";
	}
	public static equipment.Equipment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.Equipment_T result = new equipment.Equipment_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.alarmReportingIndicator=in.read_boolean();
		result.serviceState=equipment.ServiceState_THelper.read(in);
		result.expectedEquipmentObjectType=in.read_string();
		result.installedEquipmentObjectType=in.read_string();
		result.installedPartNumber=in.read_string();
		result.installedVersion=in.read_string();
		result.installedSerialNumber=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.Equipment_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_boolean(s.alarmReportingIndicator);
		equipment.ServiceState_THelper.write(out,s.serviceState);
		out.write_string(s.expectedEquipmentObjectType);
		out.write_string(s.installedEquipmentObjectType);
		out.write_string(s.installedPartNumber);
		out.write_string(s.installedVersion);
		out.write_string(s.installedSerialNumber);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
