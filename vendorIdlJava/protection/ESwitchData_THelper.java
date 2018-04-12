package protection;


/**
 *	Generated from IDL definition of struct "ESwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.ESwitchData_THelper.id(),"ESwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("eProtectionGroupType", protection.EProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("eSwitchReason", protection.ESwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("ePGPName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectedE", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("switchToE", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ESwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ESwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ESwitchData_T:1.0";
	}
	public static protection.ESwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.ESwitchData_T result = new protection.ESwitchData_T();
		result.eProtectionGroupType=in.read_string();
		result.eSwitchReason=in.read_string();
		result.ePGPName = globaldefs.NVSList_THelper.read(in);
		result.protectedE = globaldefs.NVSList_THelper.read(in);
		result.switchToE = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.ESwitchData_T s)
	{
		out.write_string(s.eProtectionGroupType);
		out.write_string(s.eSwitchReason);
		globaldefs.NVSList_THelper.write(out,s.ePGPName);
		globaldefs.NVSList_THelper.write(out,s.protectedE);
		globaldefs.NVSList_THelper.write(out,s.switchToE);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
