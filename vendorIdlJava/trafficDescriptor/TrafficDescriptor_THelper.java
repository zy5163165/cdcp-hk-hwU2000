package trafficDescriptor;


/**
 *	Generated from IDL definition of struct "TrafficDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptor_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(trafficDescriptor.TrafficDescriptor_THelper.id(),"TrafficDescriptor_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("serviceCategory", trafficDescriptor.ServiceCategory_THelper.type(), null),new org.omg.CORBA.StructMember("trafficParameters", trafficDescriptor.TrafficParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("conformanceDefinition", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("activeState", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final trafficDescriptor.TrafficDescriptor_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static trafficDescriptor.TrafficDescriptor_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trafficDescriptor/TrafficDescriptor_T:1.0";
	}
	public static trafficDescriptor.TrafficDescriptor_T read (final org.omg.CORBA.portable.InputStream in)
	{
		trafficDescriptor.TrafficDescriptor_T result = new trafficDescriptor.TrafficDescriptor_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.serviceCategory=trafficDescriptor.ServiceCategory_THelper.read(in);
		result.trafficParameters = globaldefs.NVSList_THelper.read(in);
		result.conformanceDefinition=in.read_string();
		result.activeState=in.read_boolean();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final trafficDescriptor.TrafficDescriptor_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		trafficDescriptor.ServiceCategory_THelper.write(out,s.serviceCategory);
		globaldefs.NVSList_THelper.write(out,s.trafficParameters);
		out.write_string(s.conformanceDefinition);
		out.write_boolean(s.activeState);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
