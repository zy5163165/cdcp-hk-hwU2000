package flowDomain;

/**
 *	Generated from IDL definition of struct "FlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomain_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.FlowDomain_T value;

	public FlowDomain_THolder ()
	{
	}
	public FlowDomain_THolder(final flowDomain.FlowDomain_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.FlowDomain_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.FlowDomain_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.FlowDomain_THelper.write(_out, value);
	}
}
