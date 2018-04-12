package protection;


/**
 *	Generated from IDL definition of struct "IPSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class IPSwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.IPSwitchData_THelper.id(),"IPSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("switchReason", protection.SwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("groupName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectedList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("switchToList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.IPSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.IPSwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/IPSwitchData_T:1.0";
	}
	public static protection.IPSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.IPSwitchData_T result = new protection.IPSwitchData_T();
		result.protectionType=in.read_string();
		result.switchReason=protection.SwitchReason_THelper.read(in);
		result.layerRate=in.read_short();
		result.groupName = globaldefs.NVSList_THelper.read(in);
		result.protectedList = globaldefs.NamingAttributesList_THelper.read(in);
		result.switchToList = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.IPSwitchData_T s)
	{
		out.write_string(s.protectionType);
		protection.SwitchReason_THelper.write(out,s.switchReason);
		out.write_short(s.layerRate);
		globaldefs.NVSList_THelper.write(out,s.groupName);
		globaldefs.NamingAttributesList_THelper.write(out,s.protectedList);
		globaldefs.NamingAttributesList_THelper.write(out,s.switchToList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
