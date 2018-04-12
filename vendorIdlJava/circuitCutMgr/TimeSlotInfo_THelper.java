package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "TimeSlotInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TimeSlotInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", circuitCutMgr.TimeSlotListHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.TimeSlotInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.TimeSlotInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/TimeSlotInfo_T:1.0";
	}
	public static circuitCutMgr.TimeSlotInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.TimeSlotInfo_T result = new circuitCutMgr.TimeSlotInfo_T();
		result.vc4No=in.read_ulong();
		result.timeslots = circuitCutMgr.ObjectIDListHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.TimeSlotInfo_T s)
	{
		out.write_ulong(s.vc4No);
		circuitCutMgr.ObjectIDListHelper.write(out,s.timeslots);
	}
}
