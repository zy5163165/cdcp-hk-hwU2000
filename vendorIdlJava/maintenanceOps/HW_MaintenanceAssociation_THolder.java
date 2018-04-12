package maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenanceAssociation_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceAssociation_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.HW_MaintenanceAssociation_T value;

	public HW_MaintenanceAssociation_THolder ()
	{
	}
	public HW_MaintenanceAssociation_THolder(final maintenanceOps.HW_MaintenanceAssociation_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return maintenanceOps.HW_MaintenanceAssociation_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = maintenanceOps.HW_MaintenanceAssociation_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		maintenanceOps.HW_MaintenanceAssociation_THelper.write(_out, value);
	}
}
