package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMPointDirection_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPointDirection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(flowDomain.EthernetOAMPointDirection_THelper.id(),"EthernetOAMPointDirection_T",new String[]{"EOPD_BI","EOPD_INGRESS","EOPD_EGRESS"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.EthernetOAMPointDirection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.EthernetOAMPointDirection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMPointDirection_T:1.0";
	}
	public static EthernetOAMPointDirection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return EthernetOAMPointDirection_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final EthernetOAMPointDirection_T s)
	{
		out.write_long(s.value());
	}
}
