package HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_AtmPGSingEndPara_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSingEndPara_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpProtection.HW_AtmPGSingEndPara_THelper.id(),"HW_AtmPGSingEndPara_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("switchType", HW_mstpProtection.HW_AtmPGSwitchType_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("holdOffTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("wtrTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_AtmPGSingEndPara_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_AtmPGSingEndPara_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmPGSingEndPara_T:1.0";
	}
	public static HW_mstpProtection.HW_AtmPGSingEndPara_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpProtection.HW_AtmPGSingEndPara_T result = new HW_mstpProtection.HW_AtmPGSingEndPara_T();
		result.switchType=HW_mstpProtection.HW_AtmPGSwitchType_THelper.read(in);
		result.reversionMode=protection.ReversionMode_THelper.read(in);
		result.holdOffTime=in.read_ulong();
		result.wtrTime=in.read_ulong();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpProtection.HW_AtmPGSingEndPara_T s)
	{
		HW_mstpProtection.HW_AtmPGSwitchType_THelper.write(out,s.switchType);
		protection.ReversionMode_THelper.write(out,s.reversionMode);
		out.write_ulong(s.holdOffTime);
		out.write_ulong(s.wtrTime);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
