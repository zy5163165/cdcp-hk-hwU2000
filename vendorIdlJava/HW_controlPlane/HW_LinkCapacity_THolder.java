package HW_controlPlane;

/**
 *	Generated from IDL definition of alias "HW_LinkCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_LinkCapacity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_controlPlane.HW_Capacity_T[] value;

	public HW_LinkCapacity_THolder ()
	{
	}
	public HW_LinkCapacity_THolder (final HW_controlPlane.HW_Capacity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_LinkCapacity_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_LinkCapacity_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_LinkCapacity_THelper.write (out,value);
	}
}
