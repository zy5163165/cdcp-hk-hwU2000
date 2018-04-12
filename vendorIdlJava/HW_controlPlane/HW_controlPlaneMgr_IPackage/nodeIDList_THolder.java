package HW_controlPlane.HW_controlPlaneMgr_IPackage;

/**
 *	Generated from IDL definition of alias "nodeIDList_T"
 *	@author JacORB IDL compiler 
 */

public final class nodeIDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public nodeIDList_THolder ()
	{
	}
	public nodeIDList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return nodeIDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = nodeIDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		nodeIDList_THelper.write (out,value);
	}
}
