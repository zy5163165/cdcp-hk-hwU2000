package transmissionDescriptor;
/**
 *	Generated from IDL definition of enum "ServiceCategory_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceCategory_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(transmissionDescriptor.ServiceCategory_THelper.id(),"ServiceCategory_T",new String[]{"SC_CBR","SC_VBRRT","SC_VBRNRT","SC_ABR","SC_UBR","SC_GFR","SC_NA"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final transmissionDescriptor.ServiceCategory_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static transmissionDescriptor.ServiceCategory_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/ServiceCategory_T:1.0";
	}
	public static ServiceCategory_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ServiceCategory_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ServiceCategory_T s)
	{
		out.write_long(s.value());
	}
}
