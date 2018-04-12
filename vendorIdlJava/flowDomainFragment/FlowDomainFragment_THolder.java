package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomainFragment.FlowDomainFragment_T value;

	public FlowDomainFragment_THolder ()
	{
	}
	public FlowDomainFragment_THolder(final flowDomainFragment.FlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomainFragment.FlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomainFragment.FlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomainFragment.FlowDomainFragment_THelper.write(_out, value);
	}
}
