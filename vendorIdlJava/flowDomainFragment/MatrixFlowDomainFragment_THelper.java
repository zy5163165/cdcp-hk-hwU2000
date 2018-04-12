package flowDomainFragment;


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
			_type = org.omg.CORBA.ORB.init().create_struct_tc(flowDomainFragment.MatrixFlowDomainFragment_THelper.id(),"MatrixFlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("mfdfrType", flowDomainFragment.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomainFragment.MatrixFlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomainFragment.MatrixFlowDomainFragment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment/MatrixFlowDomainFragment_T:1.0";
	}
	public static flowDomainFragment.MatrixFlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomainFragment.MatrixFlowDomainFragment_T result = new flowDomainFragment.MatrixFlowDomainFragment_T();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEnd = globaldefs.NamingAttributesList_THelper.read(in);
		result.zEnd = globaldefs.NamingAttributesList_THelper.read(in);
		result.flexible=in.read_boolean();
		result.mfdfrType=flowDomainFragment.FDFrType_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomainFragment.MatrixFlowDomainFragment_T s)
	{
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		globaldefs.NamingAttributesList_THelper.write(out,s.aEnd);
		globaldefs.NamingAttributesList_THelper.write(out,s.zEnd);
		out.write_boolean(s.flexible);
		flowDomainFragment.FDFrType_THelper.write(out,s.mfdfrType);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
