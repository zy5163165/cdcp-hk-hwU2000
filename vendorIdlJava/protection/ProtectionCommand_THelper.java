package protection;
/**
 *	Generated from IDL definition of enum "ProtectionCommand_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionCommand_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(protection.ProtectionCommand_THelper.id(),"ProtectionCommand_T",new String[]{"PC_CLEAR","PC_LOCKOUT","PC_FORCED_SWITCH","PC_MANUAL_SWITCH","PC_EXERCISER"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ProtectionCommand_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ProtectionCommand_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionCommand_T:1.0";
	}
	public static ProtectionCommand_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProtectionCommand_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProtectionCommand_T s)
	{
		out.write_long(s.value());
	}
}
