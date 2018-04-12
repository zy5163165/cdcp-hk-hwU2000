package maintenanceOps.MaintenanceMgr_IPackage;


/**
 *	Generated from IDL definition of struct "OAMParametersData_T"
 *	@author JacORB IDL compiler 
 */

public final class OAMParametersData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.id(),"OAMParametersData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/MaintenanceMgr_I/OAMParametersData_T:1.0";
	}
	public static maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T result = new maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T();
		result.objectName = globaldefs.NVSList_THelper.read(in);
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.objectName);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
	}
}
