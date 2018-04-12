package protection;
/**
 *	Generated from IDL definition of enum "ProtectionSubnetworkType_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetworkType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(protection.ProtectionSubnetworkType_THelper.id(),"ProtectionSubnetworkType_T",new String[]{"PSNT_MSP_1_PLUS_1","PSNT_MSP_M_FOR_N","PSNT_2_FIBER_ULSR","PSNT_2_FIBER_BLSR","PSNT_4_FIBER_BLSR","PSNT_USNCP","PSNT_BSNCP","PSNT_UPP","PSNT_BPP","PSNT_NP","PSNT_SNC_NODE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ProtectionSubnetworkType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ProtectionSubnetworkType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetworkType_T:1.0";
	}
	public static ProtectionSubnetworkType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProtectionSubnetworkType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProtectionSubnetworkType_T s)
	{
		out.write_long(s.value());
	}
}
