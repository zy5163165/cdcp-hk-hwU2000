package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "TtpDirection"
 *	@author JacORB IDL compiler 
 */

public final class TtpDirectionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(circuitCutMgr.TtpDirectionHelper.id(),"TtpDirection",new String[]{"AEND","ZEND","BI"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.TtpDirection s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.TtpDirection extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/TtpDirection:1.0";
	}
	public static TtpDirection read (final org.omg.CORBA.portable.InputStream in)
	{
		return TtpDirection.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TtpDirection s)
	{
		out.write_long(s.value());
	}
}
