package emsMgr;
/**
 *	Generated from IDL definition of enum "InventoryType_T"
 *	@author JacORB IDL compiler 
 */

public final class InventoryType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(emsMgr.InventoryType_THelper.id(),"InventoryType_T",new String[]{"TYPE_EMS","TYPE_MANAGEDELEMENT","TYPE_RACK","TYPE_SHELF","TYPE_SLOT","TYPE_EQUIPMENT","TYPE_PTP","TYPE_IPCROSSCONNECTION","TYPE_TOPOLOGICALLINK","TYPE_MFDFR","TYPE_TCPROFILE","TYPE_IPPROTECTIONGROUP","TYPE_EPROTECTION","TYPE_TOPOSUBNETWORKVIEW","TYPE_TRAFFICTRUNK","TYPE_FDFR","TYPE_TRAILNETWORKPROTECTION"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.InventoryType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.InventoryType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/InventoryType_T:1.0";
	}
	public static InventoryType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return InventoryType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final InventoryType_T s)
	{
		out.write_long(s.value());
	}
}
