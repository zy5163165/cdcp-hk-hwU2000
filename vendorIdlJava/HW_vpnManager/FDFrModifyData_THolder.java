package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.FDFrModifyData_T value;

	public FDFrModifyData_THolder ()
	{
	}
	public FDFrModifyData_THolder(final HW_vpnManager.FDFrModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.FDFrModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.FDFrModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.FDFrModifyData_THelper.write(_out, value);
	}
}
