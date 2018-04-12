package HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_AtmPGSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpProtection.HW_AtmPGSwitchData_THelper.id(),"HW_AtmPGSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pgName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectType", HW_mstpProtection.HW_AtmProtectType_THelper.type(), null),new org.omg.CORBA.StructMember("srcEndSwitchPara", HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.type(), null),new org.omg.CORBA.StructMember("snkEndSwitchPara", HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_AtmPGSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_AtmPGSwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmPGSwitchData_T:1.0";
	}
	public static HW_mstpProtection.HW_AtmPGSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpProtection.HW_AtmPGSwitchData_T result = new HW_mstpProtection.HW_AtmPGSwitchData_T();
		result.pgName = globaldefs.NVSList_THelper.read(in);
		result.protectType=HW_mstpProtection.HW_AtmProtectType_THelper.read(in);
		result.srcEndSwitchPara=HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.read(in);
		result.snkEndSwitchPara=HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpProtection.HW_AtmPGSwitchData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.pgName);
		HW_mstpProtection.HW_AtmProtectType_THelper.write(out,s.protectType);
		HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.write(out,s.srcEndSwitchPara);
		HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.write(out,s.snkEndSwitchPara);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
