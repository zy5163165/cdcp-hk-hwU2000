package protection;

/**
 *	Generated from IDL definition of alias "ProtectionSubnetworkList_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetworkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.ProtectionSubnetwork_T[] value;

	public ProtectionSubnetworkList_THolder ()
	{
	}
	public ProtectionSubnetworkList_THolder (final protection.ProtectionSubnetwork_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionSubnetworkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionSubnetworkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionSubnetworkList_THelper.write (out,value);
	}
}
