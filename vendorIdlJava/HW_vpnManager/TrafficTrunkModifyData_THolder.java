package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunkModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunkModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.TrafficTrunkModifyData_T value;

	public TrafficTrunkModifyData_THolder ()
	{
	}
	public TrafficTrunkModifyData_THolder(final HW_vpnManager.TrafficTrunkModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.TrafficTrunkModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.TrafficTrunkModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.TrafficTrunkModifyData_THelper.write(_out, value);
	}
}
