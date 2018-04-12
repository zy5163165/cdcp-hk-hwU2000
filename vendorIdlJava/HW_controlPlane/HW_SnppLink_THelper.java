package HW_controlPlane;


/**
 *	Generated from IDL definition of struct "HW_SnppLink_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SnppLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_controlPlane.HW_SnppLink_THelper.id(),"HW_SnppLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aEndSnppName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zEndSnppName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rateList", transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("cost", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("protectType", HW_controlPlane.HW_LinkProtectType_THelper.type(), null),new org.omg.CORBA.StructMember("linkCapacity", HW_controlPlane.HW_LinkCapacity_THelper.type(), null),new org.omg.CORBA.StructMember("linkState", HW_controlPlane.HW_LinkStateHelper.type(), null),new org.omg.CORBA.StructMember("srlgIDList", HW_controlPlane.HW_SRLGIDList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_controlPlane.HW_SnppLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_controlPlane.HW_SnppLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_controlPlane/HW_SnppLink_T:1.0";
	}
	public static HW_controlPlane.HW_SnppLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_controlPlane.HW_SnppLink_T result = new HW_controlPlane.HW_SnppLink_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.aEndSnppName = globaldefs.NVSList_THelper.read(in);
		result.zEndSnppName = globaldefs.NVSList_THelper.read(in);
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.rateList = transmissionParameters.LayerRateList_THelper.read(in);
		result.cost=in.read_ushort();
		result.protectType=in.read_string();
		result.linkCapacity = HW_controlPlane.HW_LinkCapacity_THelper.read(in);
		result.linkState=in.read_string();
		result.srlgIDList = HW_controlPlane.HW_SRLGIDList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_controlPlane.HW_SnppLink_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		globaldefs.NVSList_THelper.write(out,s.aEndSnppName);
		globaldefs.NVSList_THelper.write(out,s.zEndSnppName);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		transmissionParameters.LayerRateList_THelper.write(out,s.rateList);
		out.write_ushort(s.cost);
		out.write_string(s.protectType);
		HW_controlPlane.HW_LinkCapacity_THelper.write(out,s.linkCapacity);
		out.write_string(s.linkState);
		HW_controlPlane.HW_SRLGIDList_THelper.write(out,s.srlgIDList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
