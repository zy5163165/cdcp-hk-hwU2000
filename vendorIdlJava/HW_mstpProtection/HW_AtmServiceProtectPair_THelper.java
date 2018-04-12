package HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_AtmServiceProtectPair_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceProtectPair_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpProtection.HW_AtmServiceProtectPair_THelper.id(),"HW_AtmServiceProtectPair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("workServiceName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectServiceName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("monitorFlag", HW_mstpProtection.HW_AtmMonitorFlag_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpProtection.HW_AtmServiceProtectPair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpProtection.HW_AtmServiceProtectPair_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmServiceProtectPair_T:1.0";
	}
	public static HW_mstpProtection.HW_AtmServiceProtectPair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpProtection.HW_AtmServiceProtectPair_T result = new HW_mstpProtection.HW_AtmServiceProtectPair_T();
		result.workServiceName = globaldefs.NVSList_THelper.read(in);
		result.protectServiceName = globaldefs.NVSList_THelper.read(in);
		result.monitorFlag=HW_mstpProtection.HW_AtmMonitorFlag_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpProtection.HW_AtmServiceProtectPair_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.workServiceName);
		globaldefs.NVSList_THelper.write(out,s.protectServiceName);
		HW_mstpProtection.HW_AtmMonitorFlag_THelper.write(out,s.monitorFlag);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
