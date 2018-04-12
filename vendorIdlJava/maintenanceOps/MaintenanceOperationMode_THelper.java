package maintenanceOps;
/**
 *	Generated from IDL definition of enum "MaintenanceOperationMode_T"
 *	@author JacORB IDL compiler 
 */

public final class MaintenanceOperationMode_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(maintenanceOps.MaintenanceOperationMode_THelper.id(),"MaintenanceOperationMode_T",new String[]{"MOM_OPERATE","MOM_RELEASE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.MaintenanceOperationMode_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.MaintenanceOperationMode_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/MaintenanceOperationMode_T:1.0";
	}
	public static MaintenanceOperationMode_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return MaintenanceOperationMode_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final MaintenanceOperationMode_T s)
	{
		out.write_long(s.value());
	}
}
