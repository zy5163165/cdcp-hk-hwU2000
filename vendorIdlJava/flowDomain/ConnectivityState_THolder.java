package flowDomain;
/**
 *	Generated from IDL definition of enum "ConnectivityState_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ConnectivityState_T value;

	public ConnectivityState_THolder ()
	{
	}
	public ConnectivityState_THolder (final ConnectivityState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConnectivityState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectivityState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConnectivityState_THelper.write (out,value);
	}
}
