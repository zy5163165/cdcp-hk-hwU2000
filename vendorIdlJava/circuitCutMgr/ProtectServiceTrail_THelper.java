package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "ProtectServiceTrail_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectServiceTrail_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.ProtectServiceTrail_THelper.id(),"ProtectServiceTrail_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("aEndTP", circuitCutMgr.TPInfo_THelper.type(), null),new org.omg.CORBA.StructMember("zEndTP", circuitCutMgr.TPInfo_THelper.type(), null),new org.omg.CORBA.StructMember("route", circuitCutMgr.ServiceTrailList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.ProtectServiceTrail_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.ProtectServiceTrail_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ProtectServiceTrail_T:1.0";
	}
	public static circuitCutMgr.ProtectServiceTrail_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.ProtectServiceTrail_T result = new circuitCutMgr.ProtectServiceTrail_T();
		result.aEndTP=circuitCutMgr.TPInfo_THelper.read(in);
		result.zEndTP=circuitCutMgr.TPInfo_THelper.read(in);
		result.route = circuitCutMgr.ServiceTrailList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.ProtectServiceTrail_T s)
	{
		circuitCutMgr.TPInfo_THelper.write(out,s.aEndTP);
		circuitCutMgr.TPInfo_THelper.write(out,s.zEndTP);
		circuitCutMgr.ServiceTrailList_THelper.write(out,s.route);
	}
}
