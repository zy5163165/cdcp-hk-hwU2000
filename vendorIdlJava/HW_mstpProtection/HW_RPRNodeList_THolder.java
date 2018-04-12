package HW_mstpProtection;

/**
 *	Generated from IDL definition of alias "HW_RPRNodeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRNodeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_mstpProtection.HW_RPRNode_T[] value;

	public HW_RPRNodeList_THolder ()
	{
	}
	public HW_RPRNodeList_THolder (final HW_mstpProtection.HW_RPRNode_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_RPRNodeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_RPRNodeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_RPRNodeList_THelper.write (out,value);
	}
}
