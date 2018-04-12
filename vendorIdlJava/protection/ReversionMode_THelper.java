package protection;
/**
 *	Generated from IDL definition of enum "ReversionMode_T"
 *	@author JacORB IDL compiler 
 */

public final class ReversionMode_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ReversionMode_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ReversionMode_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ReversionMode_T:1.0";
	}
	public static ReversionMode_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ReversionMode_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ReversionMode_T s)
	{
		out.write_long(s.value());
	}
}
