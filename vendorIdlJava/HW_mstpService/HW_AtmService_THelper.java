package HW_mstpService;


/**
 *	Generated from IDL definition of struct "HW_AtmService_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmService_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpService.HW_AtmService_THelper.id(),"HW_AtmService_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectType", HW_mstpProtection.HW_AtmProtectType_THelper.type(), null),new org.omg.CORBA.StructMember("serviceType", HW_mstpService.HW_AtmServiceType_THelper.type(), null),new org.omg.CORBA.StructMember("spreadType", HW_mstpService.HW_AtmServiceSpreadType_THelper.type(), null),new org.omg.CORBA.StructMember("protectRole", HW_mstpService.HW_AtmProtectRole_THelper.type(), null),new org.omg.CORBA.StructMember("activeState", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("aEndPoint", HW_mstpService.HW_AtmServiceTP_THelper.type(), null),new org.omg.CORBA.StructMember("zEndPoint", HW_mstpService.HW_AtmServiceTP_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpService.HW_AtmService_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpService.HW_AtmService_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_AtmService_T:1.0";
	}
	public static HW_mstpService.HW_AtmService_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpService.HW_AtmService_T result = new HW_mstpService.HW_AtmService_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectType=HW_mstpProtection.HW_AtmProtectType_THelper.read(in);
		result.serviceType=HW_mstpService.HW_AtmServiceType_THelper.read(in);
		result.spreadType=HW_mstpService.HW_AtmServiceSpreadType_THelper.read(in);
		result.protectRole=HW_mstpService.HW_AtmProtectRole_THelper.read(in);
		result.activeState=in.read_boolean();
		result.aEndPoint=HW_mstpService.HW_AtmServiceTP_THelper.read(in);
		result.zEndPoint=HW_mstpService.HW_AtmServiceTP_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpService.HW_AtmService_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		HW_mstpProtection.HW_AtmProtectType_THelper.write(out,s.protectType);
		HW_mstpService.HW_AtmServiceType_THelper.write(out,s.serviceType);
		HW_mstpService.HW_AtmServiceSpreadType_THelper.write(out,s.spreadType);
		HW_mstpService.HW_AtmProtectRole_THelper.write(out,s.protectRole);
		out.write_boolean(s.activeState);
		HW_mstpService.HW_AtmServiceTP_THelper.write(out,s.aEndPoint);
		HW_mstpService.HW_AtmServiceTP_THelper.write(out,s.zEndPoint);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
