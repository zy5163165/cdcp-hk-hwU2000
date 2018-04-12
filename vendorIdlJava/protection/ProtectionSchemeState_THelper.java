package protection;
/**
 *	Generated from IDL definition of enum "ProtectionSchemeState_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSchemeState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(protection.ProtectionSchemeState_THelper.id(),"ProtectionSchemeState_T",new String[]{"PSS_UNKNOWN","PSS_AUTOMATIC","PSS_FORCED_OR_LOCKED_OUT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ProtectionSchemeState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ProtectionSchemeState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionSchemeState_T:1.0";
	}
	public static ProtectionSchemeState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProtectionSchemeState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProtectionSchemeState_T s)
	{
		out.write_long(s.value());
	}
}
