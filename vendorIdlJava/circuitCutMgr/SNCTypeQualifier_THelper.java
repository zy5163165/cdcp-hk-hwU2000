package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "SNCTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCTypeQualifier_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(circuitCutMgr.SNCTypeQualifier_THelper.id(),"SNCTypeQualifier_T",new String[]{"SNC","PREFAB_SNC"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.SNCTypeQualifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.SNCTypeQualifier_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCTypeQualifier_T:1.0";
	}
	public static SNCTypeQualifier_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return SNCTypeQualifier_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SNCTypeQualifier_T s)
	{
		out.write_long(s.value());
	}
}
