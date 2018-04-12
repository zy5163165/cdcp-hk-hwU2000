package HW_mstpService;
/**
 *	Generated from IDL definition of enum "HW_AtmServiceType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_mstpService.HW_AtmServiceType_THelper.id(),"HW_AtmServiceType_T",new String[]{"HW_AST_NA","HW_AST_PVP","HW_AST_PVC"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpService.HW_AtmServiceType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpService.HW_AtmServiceType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_AtmServiceType_T:1.0";
	}
	public static HW_AtmServiceType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_AtmServiceType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_AtmServiceType_T s)
	{
		out.write_long(s.value());
	}
}
