package maintenanceOps;


/**
 *	Generated from IDL definition of struct "HW_MaintenanceAssociation_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceAssociation_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(maintenanceOps.HW_MaintenanceAssociation_THelper.id(),"HW_MaintenanceAssociation_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("associatedService", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("maParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.HW_MaintenanceAssociation_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.HW_MaintenanceAssociation_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/HW_MaintenanceAssociation_T:1.0";
	}
	public static maintenanceOps.HW_MaintenanceAssociation_T read (final org.omg.CORBA.portable.InputStream in)
	{
		maintenanceOps.HW_MaintenanceAssociation_T result = new maintenanceOps.HW_MaintenanceAssociation_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.associatedService = globaldefs.NVSList_THelper.read(in);
		result.maParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final maintenanceOps.HW_MaintenanceAssociation_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		globaldefs.NVSList_THelper.write(out,s.associatedService);
		globaldefs.NVSList_THelper.write(out,s.maParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
