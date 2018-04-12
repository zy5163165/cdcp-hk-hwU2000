package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmMonitorFlag_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmMonitorFlag_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_mstpProtection.HW_AtmMonitorFlag_THelper.id(),"HW_AtmMonitorFlag_T",new String[]{"HW_AMF_NA","HW_AMF_CONNECTION","HW_AMF_PROTECT_PAIR"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_AtmMonitorFlag_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_AtmMonitorFlag_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmMonitorFlag_T:1.0";
	}
	public static HW_AtmMonitorFlag_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_AtmMonitorFlag_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_AtmMonitorFlag_T s)
	{
		out.write_long(s.value());
	}
}
