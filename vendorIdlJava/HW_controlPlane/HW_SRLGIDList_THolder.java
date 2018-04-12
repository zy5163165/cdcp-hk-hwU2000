package HW_controlPlane;

/**
 *	Generated from IDL definition of alias "HW_SRLGIDList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SRLGIDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public HW_SRLGIDList_THolder ()
	{
	}
	public HW_SRLGIDList_THolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_SRLGIDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_SRLGIDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_SRLGIDList_THelper.write (out,value);
	}
}
