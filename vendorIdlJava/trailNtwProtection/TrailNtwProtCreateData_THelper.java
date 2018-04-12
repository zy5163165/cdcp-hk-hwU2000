package trailNtwProtection;


/**
 *	Generated from IDL definition of struct "TrailNtwProtCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(trailNtwProtection.TrailNtwProtCreateData_THelper.id(),"TrailNtwProtCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("trailNtwProtectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("workerTrailList", globaldefs.NamingAttributesMultipleList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionTrail", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionGroupAName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectionGroupZName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("modifiableAttributes", trailNtwProtection.TrailNtwProtModifyData_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final trailNtwProtection.TrailNtwProtCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static trailNtwProtection.TrailNtwProtCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtCreateData_T:1.0";
	}
	public static trailNtwProtection.TrailNtwProtCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		trailNtwProtection.TrailNtwProtCreateData_T result = new trailNtwProtection.TrailNtwProtCreateData_T();
		result.rate=in.read_short();
		result.trailNtwProtectionType=in.read_string();
		result.workerTrailList = globaldefs.NamingAttributesMultipleList_THelper.read(in);
		result.protectionTrail = globaldefs.NamingAttributesList_THelper.read(in);
		result.protectionGroupAName = globaldefs.NVSList_THelper.read(in);
		result.protectionGroupZName = globaldefs.NVSList_THelper.read(in);
		result.modifiableAttributes=trailNtwProtection.TrailNtwProtModifyData_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final trailNtwProtection.TrailNtwProtCreateData_T s)
	{
		out.write_short(s.rate);
		out.write_string(s.trailNtwProtectionType);
		globaldefs.NamingAttributesMultipleList_THelper.write(out,s.workerTrailList);
		globaldefs.NamingAttributesList_THelper.write(out,s.protectionTrail);
		globaldefs.NVSList_THelper.write(out,s.protectionGroupAName);
		globaldefs.NVSList_THelper.write(out,s.protectionGroupZName);
		trailNtwProtection.TrailNtwProtModifyData_THelper.write(out,s.modifiableAttributes);
	}
}
