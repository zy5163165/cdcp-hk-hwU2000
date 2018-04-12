package transmissionDescriptor;
/**
 *	Generated from IDL definition of enum "TPorMFDorFDFrQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class TPorMFDorFDFrQualifier_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.id(),"TPorMFDorFDFrQualifier_T",new String[]{"aTP","aMFD","aFDFr"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final transmissionDescriptor.TPorMFDorFDFrQualifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static transmissionDescriptor.TPorMFDorFDFrQualifier_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/TPorMFDorFDFrQualifier_T:1.0";
	}
	public static TPorMFDorFDFrQualifier_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return TPorMFDorFDFrQualifier_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TPorMFDorFDFrQualifier_T s)
	{
		out.write_long(s.value());
	}
}
