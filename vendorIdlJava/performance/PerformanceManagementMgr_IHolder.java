package performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class PerformanceManagementMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public PerformanceManagementMgr_I value;
	public PerformanceManagementMgr_IHolder()
	{
	}
	public PerformanceManagementMgr_IHolder (final PerformanceManagementMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PerformanceManagementMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceManagementMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PerformanceManagementMgr_IHelper.write (_out,value);
	}
}
