package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_QosTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_QosTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_QosType_T[] value;

	public HW_QosTypeList_THolder ()
	{
	}
	public HW_QosTypeList_THolder (final HW_mstpInventory.HW_QosType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_QosTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_QosTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_QosTypeList_THelper.write (out,value);
	}
}
