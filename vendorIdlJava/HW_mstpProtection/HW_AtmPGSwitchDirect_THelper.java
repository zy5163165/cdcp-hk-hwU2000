package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmPGSwitchDirect_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSwitchDirect_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.id(),"HW_AtmPGSwitchDirect_T",new String[]{"HW_ASD_NA","HW_ASD_SRC","HW_ASD_SNK","HW_ASD_BI"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_AtmPGSwitchDirect_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_AtmPGSwitchDirect_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmPGSwitchDirect_T:1.0";
	}
	public static HW_AtmPGSwitchDirect_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_AtmPGSwitchDirect_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_AtmPGSwitchDirect_T s)
	{
		out.write_long(s.value());
	}
}
