package transmissionDescriptor;


/**
 *	Generated from IDL definition of struct "TMDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TMDModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(transmissionDescriptor.TMDModifyData_THelper.id(),"TMDModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalObjectInfo", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("containingTMDName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("externalRepresentationReference", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final transmissionDescriptor.TMDModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static transmissionDescriptor.TMDModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/TMDModifyData_T:1.0";
	}
	public static transmissionDescriptor.TMDModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		transmissionDescriptor.TMDModifyData_T result = new transmissionDescriptor.TMDModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.additionalObjectInfo = globaldefs.NVSList_THelper.read(in);
		result.containingTMDName = globaldefs.NVSList_THelper.read(in);
		result.externalRepresentationReference=in.read_string();
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final transmissionDescriptor.TMDModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		globaldefs.NVSList_THelper.write(out,s.additionalObjectInfo);
		globaldefs.NVSList_THelper.write(out,s.containingTMDName);
		out.write_string(s.externalRepresentationReference);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
