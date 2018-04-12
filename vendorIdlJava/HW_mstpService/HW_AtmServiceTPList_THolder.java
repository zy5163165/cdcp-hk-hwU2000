package HW_mstpService;

/**
 *	Generated from IDL definition of alias "HW_AtmServiceTPList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceTPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpService.HW_AtmServiceTP_T[] value;

	public HW_AtmServiceTPList_THolder ()
	{
	}
	public HW_AtmServiceTPList_THolder (final HW_mstpService.HW_AtmServiceTP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmServiceTPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmServiceTPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmServiceTPList_THelper.write (out,value);
	}
}
