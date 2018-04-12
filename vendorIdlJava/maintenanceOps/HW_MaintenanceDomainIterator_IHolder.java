package maintenanceOps;

/**
 *	Generated from IDL interface "HW_MaintenanceDomainIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_MaintenanceDomainIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MaintenanceDomainIterator_I value;
	public HW_MaintenanceDomainIterator_IHolder()
	{
	}
	public HW_MaintenanceDomainIterator_IHolder (final HW_MaintenanceDomainIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MaintenanceDomainIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MaintenanceDomainIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MaintenanceDomainIterator_IHelper.write (_out,value);
	}
}
