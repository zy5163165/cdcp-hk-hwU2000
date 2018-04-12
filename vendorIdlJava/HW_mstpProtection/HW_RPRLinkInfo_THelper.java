package HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_RPRLinkInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRLinkInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpProtection.HW_RPRLinkInfo_THelper.id(),"HW_RPRLinkInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nodeNo", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("rprLinkParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_RPRLinkInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_RPRLinkInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_RPRLinkInfo_T:1.0";
	}
	public static HW_mstpProtection.HW_RPRLinkInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpProtection.HW_RPRLinkInfo_T result = new HW_mstpProtection.HW_RPRLinkInfo_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.nodeNo=in.read_ushort();
		result.rprLinkParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpProtection.HW_RPRLinkInfo_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_ushort(s.nodeNo);
		globaldefs.NVSList_THelper.write(out,s.rprLinkParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
