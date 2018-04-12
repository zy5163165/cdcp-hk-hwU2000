package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.SNCModifyData_T value;

	public SNCModifyData_THolder ()
	{
	}
	public SNCModifyData_THolder(final subnetworkConnection.SNCModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.SNCModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.SNCModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.SNCModifyData_THelper.write(_out, value);
	}
}
