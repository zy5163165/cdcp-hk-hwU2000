package maintenanceOps;

/**
 *	Generated from IDL definition of alias "CurrentMaintenanceOperationList_T"
 *	@author JacORB IDL compiler 
 */

public final class CurrentMaintenanceOperationList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.CurrentMaintenanceOperation_T[] value;

	public CurrentMaintenanceOperationList_THolder ()
	{
	}
	public CurrentMaintenanceOperationList_THolder (final maintenanceOps.CurrentMaintenanceOperation_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CurrentMaintenanceOperationList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CurrentMaintenanceOperationList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CurrentMaintenanceOperationList_THelper.write (out,value);
	}
}
