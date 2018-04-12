package HW_controlPlane;

/**
 *	Generated from IDL definition of struct "HW_Capacity_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_Capacity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_controlPlane.HW_Capacity_T value;

	public HW_Capacity_THolder ()
	{
	}
	public HW_Capacity_THolder(final HW_controlPlane.HW_Capacity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_controlPlane.HW_Capacity_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_controlPlane.HW_Capacity_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_controlPlane.HW_Capacity_THelper.write(_out, value);
	}
}
