package flowDomain;

/**
 *	Generated from IDL definition of struct "MFDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.MFDCreateData_T value;

	public MFDCreateData_THolder ()
	{
	}
	public MFDCreateData_THolder(final flowDomain.MFDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.MFDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.MFDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.MFDCreateData_THelper.write(_out, value);
	}
}
