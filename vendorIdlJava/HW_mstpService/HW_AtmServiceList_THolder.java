package HW_mstpService;

/**
 *	Generated from IDL definition of alias "HW_AtmServiceList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpService.HW_AtmService_T[] value;

	public HW_AtmServiceList_THolder ()
	{
	}
	public HW_AtmServiceList_THolder (final HW_mstpService.HW_AtmService_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmServiceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmServiceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmServiceList_THelper.write (out,value);
	}
}
