package trafficConditioningProfile;


/**
 *	Generated from IDL definition of struct "TrafficConditioningProfileDeassign_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileDeassign_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(trafficConditioningProfile.TrafficConditioningProfileDeassign_THelper.id(),"TrafficConditioningProfileDeassign_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tcpRef", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("resourceName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("direction", terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final trafficConditioningProfile.TrafficConditioningProfileDeassign_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static trafficConditioningProfile.TrafficConditioningProfileDeassign_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trafficConditioningProfile/TrafficConditioningProfileDeassign_T:1.0";
	}
	public static trafficConditioningProfile.TrafficConditioningProfileDeassign_T read (final org.omg.CORBA.portable.InputStream in)
	{
		trafficConditioningProfile.TrafficConditioningProfileDeassign_T result = new trafficConditioningProfile.TrafficConditioningProfileDeassign_T();
		result.tcpRef = globaldefs.NVSList_THelper.read(in);
		result.resourceName = globaldefs.NVSList_THelper.read(in);
		result.direction=terminationPoint.Directionality_THelper.read(in);
		result.layerRate=in.read_short();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final trafficConditioningProfile.TrafficConditioningProfileDeassign_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.tcpRef);
		globaldefs.NVSList_THelper.write(out,s.resourceName);
		terminationPoint.Directionality_THelper.write(out,s.direction);
		out.write_short(s.layerRate);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
