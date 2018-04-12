package flowDomain;


/**
 *	Generated from IDL definition of struct "MatrixFlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomain_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(flowDomain.MatrixFlowDomain_THelper.id(),"MatrixFlowDomain_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("assignedCPTPs", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("transmissionDescriptorName", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionDescriptorState", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.MatrixFlowDomain_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.MatrixFlowDomain_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/MatrixFlowDomain_T:1.0";
	}
	public static flowDomain.MatrixFlowDomain_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomain.MatrixFlowDomain_T result = new flowDomain.MatrixFlowDomain_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.networkAccessDomain=in.read_string();
		result.assignedCPTPs = globaldefs.NamingAttributesList_THelper.read(in);
		result.flexible=in.read_boolean();
		result.transmissionDescriptorName = globaldefs.NamingAttributesList_THelper.read(in);
		result.transmissionDescriptorState=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomain.MatrixFlowDomain_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		out.write_string(s.networkAccessDomain);
		globaldefs.NamingAttributesList_THelper.write(out,s.assignedCPTPs);
		out.write_boolean(s.flexible);
		globaldefs.NamingAttributesList_THelper.write(out,s.transmissionDescriptorName);
		out.write_string(s.transmissionDescriptorState);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
