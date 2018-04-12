package guiCutThrough;
/**
 *	Generated from IDL definition of enum "ServerLaunchCapability_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerLaunchCapability_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(guiCutThrough.ServerLaunchCapability_THelper.id(),"ServerLaunchCapability_T",new String[]{"CLIENT_LAUNCH_ONLY","SERVER_LAUNCH_CAPABLE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final guiCutThrough.ServerLaunchCapability_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static guiCutThrough.ServerLaunchCapability_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/guiCutThrough/ServerLaunchCapability_T:1.0";
	}
	public static ServerLaunchCapability_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ServerLaunchCapability_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ServerLaunchCapability_T s)
	{
		out.write_long(s.value());
	}
}
