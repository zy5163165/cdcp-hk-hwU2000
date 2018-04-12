package trailNtwProtection;


/**
 *	Generated from IDL definition of struct "TrailNtwProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(trailNtwProtection.TrailNtwProtection_THelper.id(),"TrailNtwProtection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", protection.ProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("protectionSchemeState", protection.ProtectionSchemeState_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("trailNtwProtectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupAName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectionGroupZName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("pgATPList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgZTPList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("workerTrailList", globaldefs.NamingAttributesMultipleList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionTrail", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("tnpParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("apsFunction", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final trailNtwProtection.TrailNtwProtection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static trailNtwProtection.TrailNtwProtection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtection_T:1.0";
	}
	public static trailNtwProtection.TrailNtwProtection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		trailNtwProtection.TrailNtwProtection_T result = new trailNtwProtection.TrailNtwProtection_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionGroupType=protection.ProtectionGroupType_THelper.read(in);
		result.protectionSchemeState=protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=protection.ReversionMode_THelper.read(in);
		result.rate=in.read_short();
		result.trailNtwProtectionType=in.read_string();
		result.protectionGroupAName = globaldefs.NVSList_THelper.read(in);
		result.protectionGroupZName = globaldefs.NVSList_THelper.read(in);
		result.pgATPList = globaldefs.NamingAttributesList_THelper.read(in);
		result.pgZTPList = globaldefs.NamingAttributesList_THelper.read(in);
		result.workerTrailList = globaldefs.NamingAttributesMultipleList_THelper.read(in);
		result.protectionTrail = globaldefs.NamingAttributesList_THelper.read(in);
		result.tnpParameters = globaldefs.NVSList_THelper.read(in);
		result.apsFunction=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final trailNtwProtection.TrailNtwProtection_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		protection.ReversionMode_THelper.write(out,s.reversionMode);
		out.write_short(s.rate);
		out.write_string(s.trailNtwProtectionType);
		globaldefs.NVSList_THelper.write(out,s.protectionGroupAName);
		globaldefs.NVSList_THelper.write(out,s.protectionGroupZName);
		globaldefs.NamingAttributesList_THelper.write(out,s.pgATPList);
		globaldefs.NamingAttributesList_THelper.write(out,s.pgZTPList);
		globaldefs.NamingAttributesMultipleList_THelper.write(out,s.workerTrailList);
		globaldefs.NamingAttributesList_THelper.write(out,s.protectionTrail);
		globaldefs.NVSList_THelper.write(out,s.tnpParameters);
		out.write_string(s.apsFunction);
		out.write_string(s.networkAccessDomain);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
