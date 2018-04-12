package maintenanceOps;

/**
 *	Generated from IDL definition of alias "HW_MaintenanceAssociationList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceAssociationList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.HW_MaintenanceAssociation_T[] value;

	public HW_MaintenanceAssociationList_THolder ()
	{
	}
	public HW_MaintenanceAssociationList_THolder (final maintenanceOps.HW_MaintenanceAssociation_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_MaintenanceAssociationList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MaintenanceAssociationList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_MaintenanceAssociationList_THelper.write (out,value);
	}
}
