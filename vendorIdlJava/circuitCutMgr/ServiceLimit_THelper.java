package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "ServiceLimit_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceLimit_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.ServiceLimit_THelper.id(),"ServiceLimit_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("speciSeriveTrailID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("speciTS", circuitCutMgr.TimeSlotListHelper.type(), null),new org.omg.CORBA.StructMember("aNe", circuitCutMgr.ObjectIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.ServiceLimit_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.ServiceLimit_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ServiceLimit_T:1.0";
	}
	public static circuitCutMgr.ServiceLimit_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.ServiceLimit_T result = new circuitCutMgr.ServiceLimit_T();
		result.speciSeriveTrailID=in.read_ulong();
		result.speciTS = circuitCutMgr.ObjectIDListHelper.read(in);
		result.aNe=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.ServiceLimit_T s)
	{
		out.write_ulong(s.speciSeriveTrailID);
		circuitCutMgr.ObjectIDListHelper.write(out,s.speciTS);
		out.write_ulong(s.aNe);
	}
}
