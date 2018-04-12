package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunk_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunk_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.TrafficTrunk_T value;

	public TrafficTrunk_THolder ()
	{
	}
	public TrafficTrunk_THolder(final HW_vpnManager.TrafficTrunk_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.TrafficTrunk_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.TrafficTrunk_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.TrafficTrunk_THelper.write(_out, value);
	}
}
