package protection;


/**
 *	Generated from IDL definition of struct "HW_IFProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_IFProtectionGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.HW_IFProtectionGroup_THelper.id(),"HW_IFProtectionGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", protection.ProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("protectionSchemeState", protection.ProtectionSchemeState_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("pgpTPList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgpParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.HW_IFProtectionGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.HW_IFProtectionGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/HW_IFProtectionGroup_T:1.0";
	}
	public static protection.HW_IFProtectionGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.HW_IFProtectionGroup_T result = new protection.HW_IFProtectionGroup_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionGroupType=protection.ProtectionGroupType_THelper.read(in);
		result.protectionSchemeState=protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=protection.ReversionMode_THelper.read(in);
		result.rate=in.read_short();
		result.pgpTPList = globaldefs.NamingAttributesList_THelper.read(in);
		result.pgpParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.HW_IFProtectionGroup_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		protection.ReversionMode_THelper.write(out,s.reversionMode);
		out.write_short(s.rate);
		globaldefs.NamingAttributesList_THelper.write(out,s.pgpTPList);
		globaldefs.NVSList_THelper.write(out,s.pgpParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
