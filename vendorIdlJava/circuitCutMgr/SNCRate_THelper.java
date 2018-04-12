package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "SNCRate_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCRate_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(circuitCutMgr.SNCRate_THelper.id(),"SNCRate_T",new String[]{"RATE_VC4_4C","RATE_VC4_8C","RATE_VC4_16C","RATE_VC4_64C","RATE_SERVERVC4","RATE_MS","RATE_VC12","RATE_VC3","RATE_VC4"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.SNCRate_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.SNCRate_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCRate_T:1.0";
	}
	public static SNCRate_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return SNCRate_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SNCRate_T s)
	{
		out.write_long(s.value());
	}
}
