package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomainFragment.FDFrCreateData_T value;

	public FDFrCreateData_THolder ()
	{
	}
	public FDFrCreateData_THolder(final flowDomainFragment.FDFrCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomainFragment.FDFrCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomainFragment.FDFrCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomainFragment.FDFrCreateData_THelper.write(_out, value);
	}
}
