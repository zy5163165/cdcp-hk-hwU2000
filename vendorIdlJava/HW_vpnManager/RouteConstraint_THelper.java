package HW_vpnManager;


/**
 *	Generated from IDL definition of struct "RouteConstraint_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteConstraint_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_vpnManager.RouteConstraint_THelper.id(),"RouteConstraint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ipAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("routingStytle", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.RouteConstraint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.RouteConstraint_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/RouteConstraint_T:1.0";
	}
	public static HW_vpnManager.RouteConstraint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_vpnManager.RouteConstraint_T result = new HW_vpnManager.RouteConstraint_T();
		result.ipAddress=in.read_string();
		result.routingStytle=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_vpnManager.RouteConstraint_T s)
	{
		out.write_string(s.ipAddress);
		out.write_string(s.routingStytle);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
