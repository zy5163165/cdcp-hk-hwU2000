package maintenanceOps;

/**
 *	Generated from IDL interface "HW_MaintenancePointIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_MaintenancePointIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MaintenancePointIterator_I value;
	public HW_MaintenancePointIterator_IHolder()
	{
	}
	public HW_MaintenancePointIterator_IHolder (final HW_MaintenancePointIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MaintenancePointIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MaintenancePointIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MaintenancePointIterator_IHelper.write (_out,value);
	}
}
