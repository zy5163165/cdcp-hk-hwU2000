package protection;


/**
 *	Generated from IDL definition of struct "WDMSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMSwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.WDMSwitchData_THelper.id(),"WDMSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protectionType", protection.WDMProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("switchReason", protection.SwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("wPGPName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectedTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("switchToTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.WDMSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.WDMSwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/WDMSwitchData_T:1.0";
	}
	public static protection.WDMSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.WDMSwitchData_T result = new protection.WDMSwitchData_T();
		result.protectionType=in.read_string();
		result.switchReason=protection.SwitchReason_THelper.read(in);
		result.wPGPName = globaldefs.NVSList_THelper.read(in);
		result.protectedTP = globaldefs.NVSList_THelper.read(in);
		result.switchToTP = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.WDMSwitchData_T s)
	{
		out.write_string(s.protectionType);
		protection.SwitchReason_THelper.write(out,s.switchReason);
		globaldefs.NVSList_THelper.write(out,s.wPGPName);
		globaldefs.NVSList_THelper.write(out,s.protectedTP);
		globaldefs.NVSList_THelper.write(out,s.switchToTP);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
