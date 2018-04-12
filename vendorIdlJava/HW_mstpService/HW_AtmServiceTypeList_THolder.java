package HW_mstpService;

/**
 *	Generated from IDL definition of alias "HW_AtmServiceTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpService.HW_AtmServiceType_T[] value;

	public HW_AtmServiceTypeList_THolder ()
	{
	}
	public HW_AtmServiceTypeList_THolder (final HW_mstpService.HW_AtmServiceType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmServiceTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmServiceTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmServiceTypeList_THelper.write (out,value);
	}
}
