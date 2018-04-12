package protection;

/**
 *	Generated from IDL definition of struct "HW_ERPSProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ERPSProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.HW_ERPSProtectionGroup_T value;

	public HW_ERPSProtectionGroup_THolder ()
	{
	}
	public HW_ERPSProtectionGroup_THolder(final protection.HW_ERPSProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return protection.HW_ERPSProtectionGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = protection.HW_ERPSProtectionGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		protection.HW_ERPSProtectionGroup_THelper.write(_out, value);
	}
}
