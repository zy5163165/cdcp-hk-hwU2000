package protection;

/**
 *	Generated from IDL definition of struct "EProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class EProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.EProtectionGroup_T value;

	public EProtectionGroup_THolder ()
	{
	}
	public EProtectionGroup_THolder(final protection.EProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return protection.EProtectionGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = protection.EProtectionGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		protection.EProtectionGroup_THelper.write(_out, value);
	}
}
