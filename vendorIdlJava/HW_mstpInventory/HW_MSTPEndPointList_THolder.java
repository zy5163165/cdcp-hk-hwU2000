package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_MSTPEndPointList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPEndPointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_MSTPEndPoint_T[] value;

	public HW_MSTPEndPointList_THolder ()
	{
	}
	public HW_MSTPEndPointList_THolder (final HW_mstpInventory.HW_MSTPEndPoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_MSTPEndPointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MSTPEndPointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_MSTPEndPointList_THelper.write (out,value);
	}
}
