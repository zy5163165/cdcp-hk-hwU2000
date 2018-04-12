package flowDomain;

/**
 *	Generated from IDL definition of struct "MFDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.MFDModifyData_T value;

	public MFDModifyData_THolder ()
	{
	}
	public MFDModifyData_THolder(final flowDomain.MFDModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.MFDModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.MFDModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.MFDModifyData_THelper.write(_out, value);
	}
}
