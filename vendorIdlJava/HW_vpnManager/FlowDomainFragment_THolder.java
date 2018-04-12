package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.FlowDomainFragment_T value;

	public FlowDomainFragment_THolder ()
	{
	}
	public FlowDomainFragment_THolder(final HW_vpnManager.FlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_vpnManager.FlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_vpnManager.FlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_vpnManager.FlowDomainFragment_THelper.write(_out, value);
	}
}
