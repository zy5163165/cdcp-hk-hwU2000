package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "ServiceTrail_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceTrail_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.ServiceTrail_THelper.id(),"ServiceTrail_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serviceTrailID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("serviceTrailName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("usedTSList", circuitCutMgr.TimeSlotListHelper.type(), null),new org.omg.CORBA.StructMember("aTP", circuitCutMgr.TPInfo_THelper.type(), null),new org.omg.CORBA.StructMember("zTP", circuitCutMgr.TPInfo_THelper.type(), null),new org.omg.CORBA.StructMember("direction", circuitCutMgr.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("psnInId", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("psnOutId", circuitCutMgr.ObjectIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.ServiceTrail_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.ServiceTrail_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ServiceTrail_T:1.0";
	}
	public static circuitCutMgr.ServiceTrail_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.ServiceTrail_T result = new circuitCutMgr.ServiceTrail_T();
		result.serviceTrailID=in.read_ulong();
		result.serviceTrailName=in.read_string();
		result.usedTSList = circuitCutMgr.ObjectIDListHelper.read(in);
		result.aTP=circuitCutMgr.TPInfo_THelper.read(in);
		result.zTP=circuitCutMgr.TPInfo_THelper.read(in);
		result.direction=circuitCutMgr.ConnectionDirection_THelper.read(in);
		result.psnInId=in.read_ulong();
		result.psnOutId=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.ServiceTrail_T s)
	{
		out.write_ulong(s.serviceTrailID);
		out.write_string(s.serviceTrailName);
		circuitCutMgr.ObjectIDListHelper.write(out,s.usedTSList);
		circuitCutMgr.TPInfo_THelper.write(out,s.aTP);
		circuitCutMgr.TPInfo_THelper.write(out,s.zTP);
		circuitCutMgr.ConnectionDirection_THelper.write(out,s.direction);
		out.write_ulong(s.psnInId);
		out.write_ulong(s.psnOutId);
	}
}
