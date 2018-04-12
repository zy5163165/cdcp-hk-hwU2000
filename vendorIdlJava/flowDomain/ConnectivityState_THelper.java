package flowDomain;
/**
 *	Generated from IDL definition of enum "ConnectivityState_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(flowDomain.ConnectivityState_THelper.id(),"ConnectivityState_T",new String[]{"CS_UNKNOWN","CS_FULLY_CONNECTED","CS_NOT_FULLY_CONNECTED"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.ConnectivityState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.ConnectivityState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/ConnectivityState_T:1.0";
	}
	public static ConnectivityState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ConnectivityState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ConnectivityState_T s)
	{
		out.write_long(s.value());
	}
}
