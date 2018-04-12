package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_QosRule_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_QosRule_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_QosRule_T value;

	public HW_QosRule_THolder ()
	{
	}
	public HW_QosRule_THolder(final HW_mstpInventory.HW_QosRule_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_mstpInventory.HW_QosRule_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = HW_mstpInventory.HW_QosRule_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_mstpInventory.HW_QosRule_THelper.write(_out, value);
	}
}
