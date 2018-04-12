package HW_mstpService;

/**
 *	Generated from IDL definition of alias "HW_EthServiceTPList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceTPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpService.HW_EthServiceTP_T[] value;

	public HW_EthServiceTPList_THolder ()
	{
	}
	public HW_EthServiceTPList_THolder (final HW_mstpService.HW_EthServiceTP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_EthServiceTPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_EthServiceTPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_EthServiceTPList_THelper.write (out,value);
	}
}
