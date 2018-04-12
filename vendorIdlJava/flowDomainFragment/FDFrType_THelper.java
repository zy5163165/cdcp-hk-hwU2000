package flowDomainFragment;
/**
 *	Generated from IDL definition of enum "FDFrType_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(flowDomainFragment.FDFrType_THelper.id(),"FDFrType_T",new String[]{"FDFRT_POINT_TO_POINT","FDFRT_POINT_TO_MULTIPOINT","FDFRT_MULTIPOINT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomainFragment.FDFrType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomainFragment.FDFrType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment/FDFrType_T:1.0";
	}
	public static FDFrType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return FDFrType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final FDFrType_T s)
	{
		out.write_long(s.value());
	}
}
