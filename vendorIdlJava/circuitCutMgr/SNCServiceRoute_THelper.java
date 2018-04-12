package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "SNCServiceRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCServiceRoute_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.SNCServiceRoute_THelper.id(),"SNCServiceRoute_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("positiveRouteWork", circuitCutMgr.ServiceTrailList_THelper.type(), null),new org.omg.CORBA.StructMember("oppositeRouteWork", circuitCutMgr.ServiceTrailList_THelper.type(), null),new org.omg.CORBA.StructMember("positiveRouteProtection", circuitCutMgr.ServiceTrailSequence_THelper.type(), null),new org.omg.CORBA.StructMember("oppositeRouteProtection", circuitCutMgr.ServiceTrailSequence_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.SNCServiceRoute_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.SNCServiceRoute_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCServiceRoute_T:1.0";
	}
	public static circuitCutMgr.SNCServiceRoute_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.SNCServiceRoute_T result = new circuitCutMgr.SNCServiceRoute_T();
		result.positiveRouteWork = circuitCutMgr.ServiceTrailList_THelper.read(in);
		result.oppositeRouteWork = circuitCutMgr.ServiceTrailList_THelper.read(in);
		result.positiveRouteProtection = circuitCutMgr.ServiceTrailSequence_THelper.read(in);
		result.oppositeRouteProtection = circuitCutMgr.ServiceTrailSequence_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.SNCServiceRoute_T s)
	{
		circuitCutMgr.ServiceTrailList_THelper.write(out,s.positiveRouteWork);
		circuitCutMgr.ServiceTrailList_THelper.write(out,s.oppositeRouteWork);
		circuitCutMgr.ServiceTrailSequence_THelper.write(out,s.positiveRouteProtection);
		circuitCutMgr.ServiceTrailSequence_THelper.write(out,s.oppositeRouteProtection);
	}
}
