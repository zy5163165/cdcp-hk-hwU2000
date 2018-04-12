package flowDomain;

/**
 *	Generated from IDL definition of struct "FDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.FDModifyData_T value;

	public FDModifyData_THolder ()
	{
	}
	public FDModifyData_THolder(final flowDomain.FDModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.FDModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.FDModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.FDModifyData_THelper.write(_out, value);
	}
}
