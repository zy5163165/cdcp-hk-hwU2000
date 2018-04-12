package performance;


/**
 *	Generated from IDL definition of struct "HoldingTime_T"
 *	@author JacORB IDL compiler 
 */

public final class HoldingTime_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(performance.HoldingTime_THelper.id(),"HoldingTime_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("storeTime24hr", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)), null),new org.omg.CORBA.StructMember("storeTime15min", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.HoldingTime_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.HoldingTime_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/HoldingTime_T:1.0";
	}
	public static performance.HoldingTime_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.HoldingTime_T result = new performance.HoldingTime_T();
		result.storeTime24hr=in.read_short();
		result.storeTime15min=in.read_short();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.HoldingTime_T s)
	{
		out.write_short(s.storeTime24hr);
		out.write_short(s.storeTime15min);
	}
}
