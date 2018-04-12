package flowDomain;

/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.FTPCreateData_T value;

	public FTPCreateData_THolder ()
	{
	}
	public FTPCreateData_THolder(final flowDomain.FTPCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.FTPCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.FTPCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.FTPCreateData_THelper.write(_out, value);
	}
}
