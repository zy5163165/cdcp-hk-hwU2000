package trafficConditioningProfile;


/**
 *	Generated from IDL definition of struct "TCProfileCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfileCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(trafficConditioningProfile.TCProfileCreateData_THelper.id(),"TCProfileCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final trafficConditioningProfile.TCProfileCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static trafficConditioningProfile.TCProfileCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trafficConditioningProfile/TCProfileCreateData_T:1.0";
	}
	public static trafficConditioningProfile.TCProfileCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		trafficConditioningProfile.TCProfileCreateData_T result = new trafficConditioningProfile.TCProfileCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final trafficConditioningProfile.TCProfileCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
