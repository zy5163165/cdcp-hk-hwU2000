package HW_mstpInventory;
/**
 *	Generated from IDL definition of enum "HW_QosType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_QosType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_QosType_T value;

	public HW_QosType_THolder ()
	{
	}
	public HW_QosType_THolder (final HW_QosType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_QosType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_QosType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_QosType_THelper.write (out,value);
	}
}
