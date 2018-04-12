package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_SpanningTreeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SpanningTreeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_SpanningTree_T[] value;

	public HW_SpanningTreeList_THolder ()
	{
	}
	public HW_SpanningTreeList_THolder (final HW_mstpInventory.HW_SpanningTree_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_SpanningTreeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_SpanningTreeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_SpanningTreeList_THelper.write (out,value);
	}
}
