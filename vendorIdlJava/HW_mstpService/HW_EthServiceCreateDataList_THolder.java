package HW_mstpService;

/**
 *	Generated from IDL definition of alias "HW_EthServiceCreateDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceCreateDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpService.HW_EthServiceCreateData_T[] value;

	public HW_EthServiceCreateDataList_THolder ()
	{
	}
	public HW_EthServiceCreateDataList_THolder (final HW_mstpService.HW_EthServiceCreateData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_EthServiceCreateDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_EthServiceCreateDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_EthServiceCreateDataList_THelper.write (out,value);
	}
}
