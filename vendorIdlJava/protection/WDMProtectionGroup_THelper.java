package protection;


/**
 *	Generated from IDL definition of struct "WDMProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMProtectionGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.WDMProtectionGroup_THelper.id(),"WDMProtectionGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", protection.WDMProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("protectionSchemeState", protection.ProtectionSchemeState_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("pgpTPList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgpParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.WDMProtectionGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.WDMProtectionGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/WDMProtectionGroup_T:1.0";
	}
	public static protection.WDMProtectionGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.WDMProtectionGroup_T result = new protection.WDMProtectionGroup_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionGroupType=in.read_string();
		result.protectionSchemeState=protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=protection.ReversionMode_THelper.read(in);
		result.pgpTPList = globaldefs.NamingAttributesList_THelper.read(in);
		result.pgpParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.WDMProtectionGroup_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.protectionGroupType);
		protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		protection.ReversionMode_THelper.write(out,s.reversionMode);
		globaldefs.NamingAttributesList_THelper.write(out,s.pgpTPList);
		globaldefs.NVSList_THelper.write(out,s.pgpParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
