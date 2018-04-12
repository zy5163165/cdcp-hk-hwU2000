package maintenanceOps;


/**
 *	Generated from IDL definition of struct "HW_MaintenancePointCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePointCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(maintenanceOps.HW_MaintenancePointCreateData_THelper.id(),"HW_MaintenancePointCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("mdOrMaName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("tpName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.HW_MaintenancePointCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.HW_MaintenancePointCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/HW_MaintenancePointCreateData_T:1.0";
	}
	public static maintenanceOps.HW_MaintenancePointCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		maintenanceOps.HW_MaintenancePointCreateData_T result = new maintenanceOps.HW_MaintenancePointCreateData_T();
		result.mdOrMaName = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.tpName = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final maintenanceOps.HW_MaintenancePointCreateData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.mdOrMaName);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		globaldefs.NVSList_THelper.write(out,s.tpName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
