package HW_vpnManager;


/**
 *	Generated from IDL definition of struct "ServerTrailType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrailType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_vpnManager.ServerTrailType_THelper.id(),"ServerTrailType_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serverConnectionList", HW_vpnManager.ServerConnectionListType_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.ServerTrailType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.ServerTrailType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/ServerTrailType_T:1.0";
	}
	public static HW_vpnManager.ServerTrailType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_vpnManager.ServerTrailType_T result = new HW_vpnManager.ServerTrailType_T();
		result.serverConnectionList = HW_vpnManager.ServerConnectionListType_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_vpnManager.ServerTrailType_T s)
	{
		HW_vpnManager.ServerConnectionListType_THelper.write(out,s.serverConnectionList);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
	}
}
