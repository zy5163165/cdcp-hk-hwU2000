package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "PrefabSNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class PrefabSNCCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.PrefabSNCCreateData_THelper.id(),"PrefabSNCCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", circuitCutMgr.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", circuitCutMgr.SNCRate_THelper.type(), null),new org.omg.CORBA.StructMember("serviceTrailInclusions", circuitCutMgr.ServiceLimitList_THelper.type(), null),new org.omg.CORBA.StructMember("neInclusions", circuitCutMgr.ObjectIDListHelper.type(), null),new org.omg.CORBA.StructMember("neExclusions", circuitCutMgr.ObjectIDListHelper.type(), null),new org.omg.CORBA.StructMember("aEndList", circuitCutMgr.TPInfoList_THelper.type(), null),new org.omg.CORBA.StructMember("zEndList", circuitCutMgr.TPInfoList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.PrefabSNCCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.PrefabSNCCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/PrefabSNCCreateData_T:1.0";
	}
	public static circuitCutMgr.PrefabSNCCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.PrefabSNCCreateData_T result = new circuitCutMgr.PrefabSNCCreateData_T();
		result.direction=circuitCutMgr.ConnectionDirection_THelper.read(in);
		result.rate=circuitCutMgr.SNCRate_THelper.read(in);
		result.serviceTrailInclusions = circuitCutMgr.ServiceLimitList_THelper.read(in);
		result.neInclusions = circuitCutMgr.ObjectIDListHelper.read(in);
		result.neExclusions = circuitCutMgr.ObjectIDListHelper.read(in);
		result.aEndList = circuitCutMgr.TPInfoList_THelper.read(in);
		result.zEndList = circuitCutMgr.TPInfoList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.PrefabSNCCreateData_T s)
	{
		circuitCutMgr.ConnectionDirection_THelper.write(out,s.direction);
		circuitCutMgr.SNCRate_THelper.write(out,s.rate);
		circuitCutMgr.ServiceLimitList_THelper.write(out,s.serviceTrailInclusions);
		circuitCutMgr.ObjectIDListHelper.write(out,s.neInclusions);
		circuitCutMgr.ObjectIDListHelper.write(out,s.neExclusions);
		circuitCutMgr.TPInfoList_THelper.write(out,s.aEndList);
		circuitCutMgr.TPInfoList_THelper.write(out,s.zEndList);
	}
}
