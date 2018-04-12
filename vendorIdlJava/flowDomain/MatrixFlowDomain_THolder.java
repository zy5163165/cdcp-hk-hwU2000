package flowDomain;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomain_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.MatrixFlowDomain_T value;

	public MatrixFlowDomain_THolder ()
	{
	}
	public MatrixFlowDomain_THolder(final flowDomain.MatrixFlowDomain_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.MatrixFlowDomain_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.MatrixFlowDomain_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.MatrixFlowDomain_THelper.write(_out, value);
	}
}
