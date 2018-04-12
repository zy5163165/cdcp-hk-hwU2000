package trailNtwProtection;


/**
 *	Generated from IDL definition of struct "TrailNtwProtModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(trailNtwProtection.TrailNtwProtModifyData_THelper.id(),"TrailNtwProtModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", protection.ProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("pgATPList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgZTPList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("tnpParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("apsFunction", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final trailNtwProtection.TrailNtwProtModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static trailNtwProtection.TrailNtwProtModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtModifyData_T:1.0";
	}
	public static trailNtwProtection.TrailNtwProtModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		trailNtwProtection.TrailNtwProtModifyData_T result = new trailNtwProtection.TrailNtwProtModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionGroupType=protection.ProtectionGroupType_THelper.read(in);
		result.reversionMode=protection.ReversionMode_THelper.read(in);
		result.pgATPList = globaldefs.NamingAttributesList_THelper.read(in);
		result.pgZTPList = globaldefs.NamingAttributesList_THelper.read(in);
		result.tnpParameters = globaldefs.NVSList_THelper.read(in);
		result.apsFunction=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final trailNtwProtection.TrailNtwProtModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		protection.ReversionMode_THelper.write(out,s.reversionMode);
		globaldefs.NamingAttributesList_THelper.write(out,s.pgATPList);
		globaldefs.NamingAttributesList_THelper.write(out,s.pgZTPList);
		globaldefs.NVSList_THelper.write(out,s.tnpParameters);
		out.write_string(s.apsFunction);
		out.write_string(s.networkAccessDomain);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
