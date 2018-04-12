package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmPGUseState_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGUseState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_mstpProtection.HW_AtmPGUseState_THelper.id(),"HW_AtmPGUseState_T",new String[]{"HW_AUS_NA","HW_AUS_USED","HW_AUS_UNUSED"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_AtmPGUseState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_AtmPGUseState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmPGUseState_T:1.0";
	}
	public static HW_AtmPGUseState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_AtmPGUseState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_AtmPGUseState_T s)
	{
		out.write_long(s.value());
	}
}
