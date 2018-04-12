package equipment;


/**
 *	Generated from IDL definition of struct "EquipmentHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentHolder_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(equipment.EquipmentHolder_THelper.id(),"EquipmentHolder_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("alarmReportingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("holderType", equipment.EquipmentHolderType_THelper.type(), null),new org.omg.CORBA.StructMember("expectedOrInstalledEquipment", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("acceptableEquipmentTypeList", equipment.EquipmentObjectTypeList_THelper.type(), null),new org.omg.CORBA.StructMember("holderState", equipment.HolderState_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.EquipmentHolder_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.EquipmentHolder_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/EquipmentHolder_T:1.0";
	}
	public static equipment.EquipmentHolder_T read (final org.omg.CORBA.portable.InputStream in)
	{
		equipment.EquipmentHolder_T result = new equipment.EquipmentHolder_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.alarmReportingIndicator=in.read_boolean();
		result.holderType=in.read_string();
		result.expectedOrInstalledEquipment = globaldefs.NVSList_THelper.read(in);
		result.acceptableEquipmentTypeList = equipment.EquipmentObjectTypeList_THelper.read(in);
		result.holderState=equipment.HolderState_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final equipment.EquipmentHolder_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_boolean(s.alarmReportingIndicator);
		out.write_string(s.holderType);
		globaldefs.NVSList_THelper.write(out,s.expectedOrInstalledEquipment);
		equipment.EquipmentObjectTypeList_THelper.write(out,s.acceptableEquipmentTypeList);
		equipment.HolderState_THelper.write(out,s.holderState);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
