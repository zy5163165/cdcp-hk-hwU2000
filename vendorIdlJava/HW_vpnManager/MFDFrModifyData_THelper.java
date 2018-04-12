package HW_vpnManager;


/**
 *	Generated from IDL definition of struct "MFDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDFrModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_vpnManager.MFDFrModifyData_THelper.id(),"MFDFrModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("modifyType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("multipointServiceAttr", HW_vpnManager.MultipointServiceAttr_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.MFDFrModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.MFDFrModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/MFDFrModifyData_T:1.0";
	}
	public static HW_vpnManager.MFDFrModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_vpnManager.MFDFrModifyData_T result = new HW_vpnManager.MFDFrModifyData_T();
		result.modifyType=in.read_string();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.multipointServiceAttr=HW_vpnManager.MultipointServiceAttr_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_vpnManager.MFDFrModifyData_T s)
	{
		out.write_string(s.modifyType);
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		HW_vpnManager.MultipointServiceAttr_THelper.write(out,s.multipointServiceAttr);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
