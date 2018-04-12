package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "SplitHorizonGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class SplitHorizonGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.SplitHorizonGroup_T value;

	public SplitHorizonGroup_THolder ()
	{
	}
	public SplitHorizonGroup_THolder(final HW_vpnManager.SplitHorizonGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.SplitHorizonGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.SplitHorizonGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.SplitHorizonGroup_THelper.write(_out, value);
	}
}
