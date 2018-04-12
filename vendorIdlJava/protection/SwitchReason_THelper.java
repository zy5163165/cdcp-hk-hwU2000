package protection;
/**
 *	Generated from IDL definition of enum "SwitchReason_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchReason_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(protection.SwitchReason_THelper.id(),"SwitchReason_T",new String[]{"SR_NA","SR_RESTORED","SR_SIGNAL_FAIL","SR_SIGNAL_MISMATCH","SR_SIGNAL_DEGRADE","SR_AUTOMATIC_SWITCH","SR_MANUAL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.SwitchReason_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.SwitchReason_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/SwitchReason_T:1.0";
	}
	public static SwitchReason_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return SwitchReason_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SwitchReason_T s)
	{
		out.write_long(s.value());
	}
}
