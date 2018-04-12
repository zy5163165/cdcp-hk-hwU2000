package emsMgr;

/**
 *	Generated from IDL definition of alias "InventoryTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class InventoryTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.InventoryType_T[] value;

	public InventoryTypeList_THolder ()
	{
	}
	public InventoryTypeList_THolder (final emsMgr.InventoryType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InventoryTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InventoryTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InventoryTypeList_THelper.write (out,value);
	}
}
