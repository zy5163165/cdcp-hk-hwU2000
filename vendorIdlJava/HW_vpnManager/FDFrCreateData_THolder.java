package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.FDFrCreateData_T value;

	public FDFrCreateData_THolder ()
	{
	}
	public FDFrCreateData_THolder(final HW_vpnManager.FDFrCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.FDFrCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.FDFrCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.FDFrCreateData_THelper.write(_out, value);
	}
}
