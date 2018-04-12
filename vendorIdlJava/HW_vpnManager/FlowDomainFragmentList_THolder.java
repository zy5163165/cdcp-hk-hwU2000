package HW_vpnManager;

/**
 *	Generated from IDL definition of alias "FlowDomainFragmentList_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragmentList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.FlowDomainFragment_T[] value;

	public FlowDomainFragmentList_THolder ()
	{
	}
	public FlowDomainFragmentList_THolder (final HW_vpnManager.FlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FlowDomainFragmentList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FlowDomainFragmentList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FlowDomainFragmentList_THelper.write (out,value);
	}
}
