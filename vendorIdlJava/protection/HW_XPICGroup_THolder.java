package protection;

/**
 *	Generated from IDL definition of struct "HW_XPICGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_XPICGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.HW_XPICGroup_T value;

	public HW_XPICGroup_THolder ()
	{
	}
	public HW_XPICGroup_THolder(final protection.HW_XPICGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return protection.HW_XPICGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = protection.HW_XPICGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		protection.HW_XPICGroup_THelper.write(_out, value);
	}
}
