package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmProtectType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmProtectType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_mstpProtection.HW_AtmProtectType_THelper.id(),"HW_AtmProtectType_T",new String[]{"HW_APT_NA","HW_APT_NONE","HW_APT_1PLUS1","HW_APT_1V1"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_AtmProtectType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_AtmProtectType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmProtectType_T:1.0";
	}
	public static HW_AtmProtectType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_AtmProtectType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_AtmProtectType_T s)
	{
		out.write_long(s.value());
	}
}
