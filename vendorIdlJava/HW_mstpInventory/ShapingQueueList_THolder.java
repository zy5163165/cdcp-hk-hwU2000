package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "ShapingQueueList_T"
 *	@author JacORB IDL compiler 
 */

public final class ShapingQueueList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.ShapingQueue[] value;

	public ShapingQueueList_THolder ()
	{
	}
	public ShapingQueueList_THolder (final HW_mstpInventory.ShapingQueue[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ShapingQueueList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ShapingQueueList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ShapingQueueList_THelper.write (out,value);
	}
}
