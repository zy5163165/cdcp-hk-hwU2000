package HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_EthService_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthService_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpService.HW_EthService_T value;

	public HW_EthService_THolder ()
	{
	}
	public HW_EthService_THolder(final HW_mstpService.HW_EthService_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_mstpService.HW_EthService_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_mstpService.HW_EthService_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_mstpService.HW_EthService_THelper.write(_out, value);
	}
}
