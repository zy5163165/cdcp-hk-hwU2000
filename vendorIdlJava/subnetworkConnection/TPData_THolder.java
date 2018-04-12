package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "TPData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.TPData_T value;

	public TPData_THolder ()
	{
	}
	public TPData_THolder(final subnetworkConnection.TPData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.TPData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.TPData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.TPData_THelper.write(_out, value);
	}
}
