package protection;
/**
 *	Generated from IDL definition of enum "ProtectionType_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(protection.ProtectionType_THelper.id(),"ProtectionType_T",new String[]{"PT_MSP_APS","PT_SNCP"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ProtectionType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ProtectionType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionType_T:1.0";
	}
	public static ProtectionType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProtectionType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProtectionType_T s)
	{
		out.write_long(s.value());
	}
}
