package protection;


/**
 *	Generated from IDL definition of struct "EProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class EProtectionGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.EProtectionGroup_THelper.id(),"EProtectionGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("eProtectionGroupType", protection.EProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("protectionSchemeState", protection.ProtectionSchemeState_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("protectedList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("protectingList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("ePgpParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.EProtectionGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.EProtectionGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/EProtectionGroup_T:1.0";
	}
	public static protection.EProtectionGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.EProtectionGroup_T result = new protection.EProtectionGroup_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.eProtectionGroupType=in.read_string();
		result.protectionSchemeState=protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=protection.ReversionMode_THelper.read(in);
		result.protectedList = globaldefs.NamingAttributesList_THelper.read(in);
		result.protectingList = globaldefs.NamingAttributesList_THelper.read(in);
		result.ePgpParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.EProtectionGroup_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.eProtectionGroupType);
		protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		protection.ReversionMode_THelper.write(out,s.reversionMode);
		globaldefs.NamingAttributesList_THelper.write(out,s.protectedList);
		globaldefs.NamingAttributesList_THelper.write(out,s.protectingList);
		globaldefs.NVSList_THelper.write(out,s.ePgpParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
