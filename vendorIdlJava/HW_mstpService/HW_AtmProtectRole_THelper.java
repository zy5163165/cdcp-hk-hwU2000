package HW_mstpService;
/**
 *	Generated from IDL definition of enum "HW_AtmProtectRole_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmProtectRole_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_mstpService.HW_AtmProtectRole_THelper.id(),"HW_AtmProtectRole_T",new String[]{"HW_APR_NA","HW_APR_WORKING","HW_APR_PROTECTING"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpService.HW_AtmProtectRole_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpService.HW_AtmProtectRole_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_AtmProtectRole_T:1.0";
	}
	public static HW_AtmProtectRole_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_AtmProtectRole_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_AtmProtectRole_T s)
	{
		out.write_long(s.value());
	}
}
