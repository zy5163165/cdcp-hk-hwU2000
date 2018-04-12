package maintenanceOps;

/**
 *	Generated from IDL definition of alias "PRBSTestParameterList_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestParameterList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.PRBSTestParameter_T[] value;

	public PRBSTestParameterList_THolder ()
	{
	}
	public PRBSTestParameterList_THolder (final maintenanceOps.PRBSTestParameter_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PRBSTestParameterList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PRBSTestParameterList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PRBSTestParameterList_THelper.write (out,value);
	}
}
