package protection;
/**
 *	Generated from IDL definition of enum "ProtectionGroupType_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroupType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(protection.ProtectionGroupType_THelper.id(),"ProtectionGroupType_T",new String[]{"PGT_MSP_1_PLUS_1","PGT_MSP_1_FOR_N","PGT_2_FIBER_BLSR","PGT_4_FIBER_BLSR"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ProtectionGroupType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ProtectionGroupType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionGroupType_T:1.0";
	}
	public static ProtectionGroupType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProtectionGroupType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProtectionGroupType_T s)
	{
		out.write_long(s.value());
	}
}
