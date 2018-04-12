package trafficConditioningProfile;


/**
 *	Generated from IDL definition of struct "HW_TrafficClassifier_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TrafficClassifier_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(trafficConditioningProfile.HW_TrafficClassifier_THelper.id(),"HW_TrafficClassifier_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("classifierID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("logicalRelationType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("action", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final trafficConditioningProfile.HW_TrafficClassifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static trafficConditioningProfile.HW_TrafficClassifier_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trafficConditioningProfile/HW_TrafficClassifier_T:1.0";
	}
	public static trafficConditioningProfile.HW_TrafficClassifier_T read (final org.omg.CORBA.portable.InputStream in)
	{
		trafficConditioningProfile.HW_TrafficClassifier_T result = new trafficConditioningProfile.HW_TrafficClassifier_T();
		result.classifierID=in.read_string();
		result.logicalRelationType=in.read_string();
		result.action=in.read_string();
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final trafficConditioningProfile.HW_TrafficClassifier_T s)
	{
		out.write_string(s.classifierID);
		out.write_string(s.logicalRelationType);
		out.write_string(s.action);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
	}
}
