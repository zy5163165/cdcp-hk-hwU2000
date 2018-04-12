package subnetworkConnection;
/**
 *	Generated from IDL definition of enum "StaticProtectionLevel_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticProtectionLevel_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public StaticProtectionLevel_T value;

	public StaticProtectionLevel_THolder ()
	{
	}
	public StaticProtectionLevel_THolder (final StaticProtectionLevel_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StaticProtectionLevel_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StaticProtectionLevel_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StaticProtectionLevel_THelper.write (out,value);
	}
}
