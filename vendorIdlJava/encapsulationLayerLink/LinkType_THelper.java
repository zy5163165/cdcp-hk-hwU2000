package encapsulationLayerLink;
/**
 *	Generated from IDL definition of enum "LinkType_T"
 *	@author JacORB IDL compiler 
 */

public final class LinkType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(encapsulationLayerLink.LinkType_THelper.id(),"LinkType_T",new String[]{"LT_POINT_TO_POINT","LT_POINT_TO_MULTIPOINT","LT_MULTIPOINT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final encapsulationLayerLink.LinkType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static encapsulationLayerLink.LinkType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/encapsulationLayerLink/LinkType_T:1.0";
	}
	public static LinkType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return LinkType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final LinkType_T s)
	{
		out.write_long(s.value());
	}
}
