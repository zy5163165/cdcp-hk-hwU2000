package maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_ATMMaintenanceEntityAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ATMMaintenanceEntityAttr_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.HW_ATMMaintenanceEntityAttr_T value;

	public HW_ATMMaintenanceEntityAttr_THolder ()
	{
	}
	public HW_ATMMaintenanceEntityAttr_THolder(final maintenanceOps.HW_ATMMaintenanceEntityAttr_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.write(_out, value);
	}
}
