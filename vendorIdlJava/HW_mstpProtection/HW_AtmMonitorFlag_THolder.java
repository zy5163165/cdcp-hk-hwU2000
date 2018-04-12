package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmMonitorFlag_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmMonitorFlag_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_AtmMonitorFlag_T value;

	public HW_AtmMonitorFlag_THolder ()
	{
	}
	public HW_AtmMonitorFlag_THolder (final HW_AtmMonitorFlag_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmMonitorFlag_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmMonitorFlag_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmMonitorFlag_THelper.write (out,value);
	}
}
