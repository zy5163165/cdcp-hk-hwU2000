package HW_mstpService;

/**
 *	Generated from IDL definition of alias "HW_EthServiceTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpService.HW_EthServiceType_T[] value;

	public HW_EthServiceTypeList_THolder ()
	{
	}
	public HW_EthServiceTypeList_THolder (final HW_mstpService.HW_EthServiceType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_EthServiceTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_EthServiceTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_EthServiceTypeList_THelper.write (out,value);
	}
}
