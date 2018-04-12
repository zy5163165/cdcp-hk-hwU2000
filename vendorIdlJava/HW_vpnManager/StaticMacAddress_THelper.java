package HW_vpnManager;


/**
 *	Generated from IDL definition of struct "StaticMacAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticMacAddress_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_vpnManager.StaticMacAddress_THelper.id(),"StaticMacAddress_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("staticMacType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("macAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("peVID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("ceVID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("tpName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.StaticMacAddress_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.StaticMacAddress_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/StaticMacAddress_T:1.0";
	}
	public static HW_vpnManager.StaticMacAddress_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_vpnManager.StaticMacAddress_T result = new HW_vpnManager.StaticMacAddress_T();
		result.staticMacType=in.read_string();
		result.macAddress=in.read_string();
		result.peVID=in.read_ulong();
		result.ceVID=in.read_ulong();
		result.tpName = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_vpnManager.StaticMacAddress_T s)
	{
		out.write_string(s.staticMacType);
		out.write_string(s.macAddress);
		out.write_ulong(s.peVID);
		out.write_ulong(s.ceVID);
		globaldefs.NVSList_THelper.write(out,s.tpName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
