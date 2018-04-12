package protection;


/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.SwitchData_THelper.id(),"SwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protectionType", protection.ProtectionType_THelper.type(), null),new org.omg.CORBA.StructMember("switchReason", protection.SwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("groupName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectedTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("switchToTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.SwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.SwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/SwitchData_T:1.0";
	}
	public static protection.SwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.SwitchData_T result = new protection.SwitchData_T();
		result.protectionType=protection.ProtectionType_THelper.read(in);
		result.switchReason=protection.SwitchReason_THelper.read(in);
		result.layerRate=in.read_short();
		result.groupName = globaldefs.NVSList_THelper.read(in);
		result.protectedTP = globaldefs.NVSList_THelper.read(in);
		result.switchToTP = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.SwitchData_T s)
	{
		protection.ProtectionType_THelper.write(out,s.protectionType);
		protection.SwitchReason_THelper.write(out,s.switchReason);
		out.write_short(s.layerRate);
		globaldefs.NVSList_THelper.write(out,s.groupName);
		globaldefs.NVSList_THelper.write(out,s.protectedTP);
		globaldefs.NVSList_THelper.write(out,s.switchToTP);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
