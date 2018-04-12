package HW_vpnManager;
/**
 *	Generated from IDL definition of enum "UsedAsType_T"
 *	@author JacORB IDL compiler 
 */

public final class UsedAsType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_vpnManager.UsedAsType_THelper.id(),"UsedAsType_T",new String[]{"UA_WORKING","UA_PROTECTION","UA_DNI"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.UsedAsType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.UsedAsType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/UsedAsType_T:1.0";
	}
	public static UsedAsType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return UsedAsType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final UsedAsType_T s)
	{
		out.write_long(s.value());
	}
}
