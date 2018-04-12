package maintenanceOps;


/**
 *	Generated from IDL definition of struct "HW_ATMMaintenanceEntityAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ATMMaintenanceEntityAttr_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.id(),"HW_ATMMaintenanceEntityAttr_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("aEndName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zEndName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("serviceName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.HW_ATMMaintenanceEntityAttr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.HW_ATMMaintenanceEntityAttr_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/HW_ATMMaintenanceEntityAttr_T:1.0";
	}
	public static maintenanceOps.HW_ATMMaintenanceEntityAttr_T read (final org.omg.CORBA.portable.InputStream in)
	{
		maintenanceOps.HW_ATMMaintenanceEntityAttr_T result = new maintenanceOps.HW_ATMMaintenanceEntityAttr_T();
		result.aEndName = globaldefs.NVSList_THelper.read(in);
		result.zEndName = globaldefs.NVSList_THelper.read(in);
		result.serviceName = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final maintenanceOps.HW_ATMMaintenanceEntityAttr_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.aEndName);
		globaldefs.NVSList_THelper.write(out,s.zEndName);
		globaldefs.NVSList_THelper.write(out,s.serviceName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
