package maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenancePoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePoint_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.HW_MaintenancePoint_T value;

	public HW_MaintenancePoint_THolder ()
	{
	}
	public HW_MaintenancePoint_THolder(final maintenanceOps.HW_MaintenancePoint_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return maintenanceOps.HW_MaintenancePoint_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = maintenanceOps.HW_MaintenancePoint_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		maintenanceOps.HW_MaintenancePoint_THelper.write(_out, value);
	}
}
