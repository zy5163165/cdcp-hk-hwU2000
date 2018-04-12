package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMCommandType_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMCommandType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(flowDomain.EthernetOAMCommandType_THelper.id(),"EthernetOAMCommandType_T",new String[]{"EOCT_CC","EOCT_LB","EOCT_LT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.EthernetOAMCommandType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.EthernetOAMCommandType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMCommandType_T:1.0";
	}
	public static EthernetOAMCommandType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return EthernetOAMCommandType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final EthernetOAMCommandType_T s)
	{
		out.write_long(s.value());
	}
}
