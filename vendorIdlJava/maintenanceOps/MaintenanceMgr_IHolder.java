package maintenanceOps;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class MaintenanceMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MaintenanceMgr_I value;
	public MaintenanceMgr_IHolder()
	{
	}
	public MaintenanceMgr_IHolder (final MaintenanceMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MaintenanceMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MaintenanceMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MaintenanceMgr_IHelper.write (_out,value);
	}
}
