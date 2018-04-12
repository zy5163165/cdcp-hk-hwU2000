package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CrossConnect_T"
 *	@author JacORB IDL compiler 
 */

public final class CrossConnect_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.CrossConnect_T value;

	public CrossConnect_THolder ()
	{
	}
	public CrossConnect_THolder(final subnetworkConnection.CrossConnect_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.CrossConnect_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.CrossConnect_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.CrossConnect_THelper.write(_out, value);
	}
}
