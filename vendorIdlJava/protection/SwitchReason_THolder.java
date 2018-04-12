package protection;
/**
 *	Generated from IDL definition of enum "SwitchReason_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchReason_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public SwitchReason_T value;

	public SwitchReason_THolder ()
	{
	}
	public SwitchReason_THolder (final SwitchReason_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SwitchReason_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SwitchReason_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SwitchReason_THelper.write (out,value);
	}
}
