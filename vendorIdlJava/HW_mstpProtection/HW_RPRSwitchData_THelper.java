package HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_RPRSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRSwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpProtection.HW_RPRSwitchData_THelper.id(),"HW_RPRSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nodeName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("switchReason", protection.SwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("switchState", HW_mstpProtection.HW_SwitchState_THelper.type(), null),new org.omg.CORBA.StructMember("switchPosition", HW_mstpProtection.HW_SwitchPosition_THelper.type(), null),new org.omg.CORBA.StructMember("switchParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_RPRSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_RPRSwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_RPRSwitchData_T:1.0";
	}
	public static HW_mstpProtection.HW_RPRSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpProtection.HW_RPRSwitchData_T result = new HW_mstpProtection.HW_RPRSwitchData_T();
		result.nodeName = globaldefs.NVSList_THelper.read(in);
		result.switchReason=protection.SwitchReason_THelper.read(in);
		result.switchState=HW_mstpProtection.HW_SwitchState_THelper.read(in);
		result.switchPosition=HW_mstpProtection.HW_SwitchPosition_THelper.read(in);
		result.switchParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpProtection.HW_RPRSwitchData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.nodeName);
		protection.SwitchReason_THelper.write(out,s.switchReason);
		HW_mstpProtection.HW_SwitchState_THelper.write(out,s.switchState);
		HW_mstpProtection.HW_SwitchPosition_THelper.write(out,s.switchPosition);
		globaldefs.NVSList_THelper.write(out,s.switchParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
