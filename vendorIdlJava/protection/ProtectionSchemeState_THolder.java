package protection;
/**
 *	Generated from IDL definition of enum "ProtectionSchemeState_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSchemeState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProtectionSchemeState_T value;

	public ProtectionSchemeState_THolder ()
	{
	}
	public ProtectionSchemeState_THolder (final ProtectionSchemeState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionSchemeState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionSchemeState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionSchemeState_THelper.write (out,value);
	}
}
