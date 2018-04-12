package subnetworkConnection;
/**
 *	Generated from IDL definition of enum "ProtectionEffort_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionEffort_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProtectionEffort_T value;

	public ProtectionEffort_THolder ()
	{
	}
	public ProtectionEffort_THolder (final ProtectionEffort_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionEffort_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionEffort_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionEffort_THelper.write (out,value);
	}
}
