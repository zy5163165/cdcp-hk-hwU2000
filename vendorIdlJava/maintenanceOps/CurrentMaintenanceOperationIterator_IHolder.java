package maintenanceOps;

/**
 *	Generated from IDL interface "CurrentMaintenanceOperationIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class CurrentMaintenanceOperationIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CurrentMaintenanceOperationIterator_I value;
	public CurrentMaintenanceOperationIterator_IHolder()
	{
	}
	public CurrentMaintenanceOperationIterator_IHolder (final CurrentMaintenanceOperationIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CurrentMaintenanceOperationIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CurrentMaintenanceOperationIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CurrentMaintenanceOperationIterator_IHelper.write (_out,value);
	}
}
