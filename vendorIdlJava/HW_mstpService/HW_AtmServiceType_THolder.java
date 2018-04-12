package HW_mstpService;
/**
 *	Generated from IDL definition of enum "HW_AtmServiceType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_AtmServiceType_T value;

	public HW_AtmServiceType_THolder ()
	{
	}
	public HW_AtmServiceType_THolder (final HW_AtmServiceType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmServiceType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmServiceType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmServiceType_THelper.write (out,value);
	}
}
