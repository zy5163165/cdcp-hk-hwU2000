package flowDomain;

/**
 *	Generated from IDL definition of struct "FDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.FDCreateData_T value;

	public FDCreateData_THolder ()
	{
	}
	public FDCreateData_THolder(final flowDomain.FDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.FDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.FDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.FDCreateData_THelper.write(_out, value);
	}
}
