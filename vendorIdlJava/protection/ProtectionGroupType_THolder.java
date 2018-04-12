package protection;
/**
 *	Generated from IDL definition of enum "ProtectionGroupType_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroupType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProtectionGroupType_T value;

	public ProtectionGroupType_THolder ()
	{
	}
	public ProtectionGroupType_THolder (final ProtectionGroupType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionGroupType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionGroupType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionGroupType_THelper.write (out,value);
	}
}
