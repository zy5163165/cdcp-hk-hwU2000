package maintenanceOps;

/**
 *	Generated from IDL definition of alias "HW_MaintenanceDomainList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceDomainList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.HW_MaintenanceDomain_T[] value;

	public HW_MaintenanceDomainList_THolder ()
	{
	}
	public HW_MaintenanceDomainList_THolder (final maintenanceOps.HW_MaintenanceDomain_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_MaintenanceDomainList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MaintenanceDomainList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_MaintenanceDomainList_THelper.write (out,value);
	}
}
