package terminationPoint;
/**
 *	Generated from IDL definition of enum "TPConnectionState_T"
 *	@author JacORB IDL compiler 
 */

public final class TPConnectionState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TPConnectionState_T value;

	public TPConnectionState_THolder ()
	{
	}
	public TPConnectionState_THolder (final TPConnectionState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPConnectionState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPConnectionState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPConnectionState_THelper.write (out,value);
	}
}
