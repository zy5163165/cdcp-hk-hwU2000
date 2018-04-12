package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_MSTPEndPointTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPEndPointTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpInventory.HW_MSTPEndPointType_T[] value;

	public HW_MSTPEndPointTypeList_THolder ()
	{
	}
	public HW_MSTPEndPointTypeList_THolder (final HW_mstpInventory.HW_MSTPEndPointType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_MSTPEndPointTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MSTPEndPointTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_MSTPEndPointTypeList_THelper.write (out,value);
	}
}
