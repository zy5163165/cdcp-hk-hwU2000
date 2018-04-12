package flowDomain;


/**
 *	Generated from IDL definition of struct "FDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(flowDomain.FDCreateData_THelper.id(),"FDCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("mfds", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("fdEdgeCPTPs", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.FDCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.FDCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/FDCreateData_T:1.0";
	}
	public static flowDomain.FDCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomain.FDCreateData_T result = new flowDomain.FDCreateData_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.mfds = globaldefs.NamingAttributesList_THelper.read(in);
		result.fdEdgeCPTPs = globaldefs.NamingAttributesList_THelper.read(in);
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomain.FDCreateData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		globaldefs.NamingAttributesList_THelper.write(out,s.mfds);
		globaldefs.NamingAttributesList_THelper.write(out,s.fdEdgeCPTPs);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
