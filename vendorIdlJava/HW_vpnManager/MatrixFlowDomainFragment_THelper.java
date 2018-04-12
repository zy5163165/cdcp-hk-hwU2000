package HW_vpnManager;


/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_vpnManager.MatrixFlowDomainFragment_THelper.id(),"MatrixFlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("multipointServiceAttr", HW_vpnManager.MultipointServiceAttr_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrState", subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("administrativeState", performance.AdministrativeState_THelper.type(), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("mfdfrType", HW_vpnManager.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.MatrixFlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.MatrixFlowDomainFragment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/MatrixFlowDomainFragment_T:1.0";
	}
	public static HW_vpnManager.MatrixFlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_vpnManager.MatrixFlowDomainFragment_T result = new HW_vpnManager.MatrixFlowDomainFragment_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.multipointServiceAttr=HW_vpnManager.MultipointServiceAttr_THelper.read(in);
		result.aEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.fdfrState=subnetworkConnection.SNCState_THelper.read(in);
		result.administrativeState=performance.AdministrativeState_THelper.read(in);
		result.flexible=in.read_boolean();
		result.mfdfrType=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_vpnManager.MatrixFlowDomainFragment_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		HW_vpnManager.MultipointServiceAttr_THelper.write(out,s.multipointServiceAttr);
		subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		subnetworkConnection.SNCState_THelper.write(out,s.fdfrState);
		performance.AdministrativeState_THelper.write(out,s.administrativeState);
		out.write_boolean(s.flexible);
		out.write_string(s.mfdfrType);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
