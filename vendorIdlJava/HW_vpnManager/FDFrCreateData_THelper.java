package HW_vpnManager;


/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_vpnManager.FDFrCreateData_THelper.id(),"FDFrCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("multipointServiceAttr", HW_vpnManager.MultipointServiceAttr_THelper.type(), null),new org.omg.CORBA.StructMember("vendorExtensions", HW_vpnManager.ServerTrailListType_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrType", HW_vpnManager.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.FDFrCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.FDFrCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/FDFrCreateData_T:1.0";
	}
	public static HW_vpnManager.FDFrCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_vpnManager.FDFrCreateData_T result = new HW_vpnManager.FDFrCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.multipointServiceAttr=HW_vpnManager.MultipointServiceAttr_THelper.read(in);
		result.vendorExtensions = HW_vpnManager.ServerTrailListType_THelper.read(in);
		result.fdfrType=in.read_string();
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_vpnManager.FDFrCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		HW_vpnManager.MultipointServiceAttr_THelper.write(out,s.multipointServiceAttr);
		HW_vpnManager.ServerTrailListType_THelper.write(out,s.vendorExtensions);
		out.write_string(s.fdfrType);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
