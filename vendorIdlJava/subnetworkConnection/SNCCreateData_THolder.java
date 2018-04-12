package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.SNCCreateData_T value;

	public SNCCreateData_THolder ()
	{
	}
	public SNCCreateData_THolder(final subnetworkConnection.SNCCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.SNCCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.SNCCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.SNCCreateData_THelper.write(_out, value);
	}
}
