package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunkCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.TrafficTrunkCreateData_T value;

	public TrafficTrunkCreateData_THolder ()
	{
	}
	public TrafficTrunkCreateData_THolder(final HW_vpnManager.TrafficTrunkCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.TrafficTrunkCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.TrafficTrunkCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.TrafficTrunkCreateData_THelper.write(_out, value);
	}
}
