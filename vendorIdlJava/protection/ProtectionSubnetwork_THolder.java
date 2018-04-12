package protection;

/**
 *	Generated from IDL definition of struct "ProtectionSubnetwork_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetwork_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.ProtectionSubnetwork_T value;

	public ProtectionSubnetwork_THolder ()
	{
	}
	public ProtectionSubnetwork_THolder(final protection.ProtectionSubnetwork_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return protection.ProtectionSubnetwork_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = protection.ProtectionSubnetwork_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		protection.ProtectionSubnetwork_THelper.write(_out, value);
	}
}
