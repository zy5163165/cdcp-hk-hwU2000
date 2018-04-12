package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMPointType_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPointType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(flowDomain.EthernetOAMPointType_THelper.id(),"EthernetOAMPointType_T",new String[]{"EOT_MEP","EOP_MIP"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.EthernetOAMPointType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.EthernetOAMPointType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMPointType_T:1.0";
	}
	public static EthernetOAMPointType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return EthernetOAMPointType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final EthernetOAMPointType_T s)
	{
		out.write_long(s.value());
	}
}
