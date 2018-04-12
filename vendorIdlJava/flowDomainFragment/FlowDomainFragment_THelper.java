package flowDomainFragment;


/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(flowDomainFragment.FlowDomainFragment_THelper.id(),"FlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("endTPs", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("administrativeState", performance.AdministrativeState_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrState", subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrType", flowDomainFragment.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomainFragment.FlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomainFragment.FlowDomainFragment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment/FlowDomainFragment_T:1.0";
	}
	public static flowDomainFragment.FlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomainFragment.FlowDomainFragment_T result = new flowDomainFragment.FlowDomainFragment_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.endTPs = globaldefs.NamingAttributesList_THelper.read(in);
		result.networkAccessDomain=in.read_string();
		result.flexible=in.read_boolean();
		result.administrativeState=performance.AdministrativeState_THelper.read(in);
		result.fdfrState=subnetworkConnection.SNCState_THelper.read(in);
		result.fdfrType=flowDomainFragment.FDFrType_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomainFragment.FlowDomainFragment_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		globaldefs.NamingAttributesList_THelper.write(out,s.endTPs);
		out.write_string(s.networkAccessDomain);
		out.write_boolean(s.flexible);
		performance.AdministrativeState_THelper.write(out,s.administrativeState);
		subnetworkConnection.SNCState_THelper.write(out,s.fdfrState);
		flowDomainFragment.FDFrType_THelper.write(out,s.fdfrType);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
