package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_ForwardEndPointList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ForwardEndPointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_ForwardEndPoint_T[] value;

	public HW_ForwardEndPointList_THolder ()
	{
	}
	public HW_ForwardEndPointList_THolder (final HW_mstpInventory.HW_ForwardEndPoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_ForwardEndPointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_ForwardEndPointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_ForwardEndPointList_THelper.write (out,value);
	}
}
