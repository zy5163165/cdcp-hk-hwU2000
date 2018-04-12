package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_LAGBranchPortList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_LAGBranchPortList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_LAGBranchPort_T[] value;

	public HW_LAGBranchPortList_THolder ()
	{
	}
	public HW_LAGBranchPortList_THolder (final HW_mstpInventory.HW_LAGBranchPort_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_LAGBranchPortList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_LAGBranchPortList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_LAGBranchPortList_THelper.write (out,value);
	}
}
