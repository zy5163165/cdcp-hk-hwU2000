package maintenanceOps;

/**
 *	Generated from IDL definition of struct "PRBSTestParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestParameter_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.PRBSTestParameter_T value;

	public PRBSTestParameter_THolder ()
	{
	}
	public PRBSTestParameter_THolder(final maintenanceOps.PRBSTestParameter_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return maintenanceOps.PRBSTestParameter_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = maintenanceOps.PRBSTestParameter_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		maintenanceOps.PRBSTestParameter_THelper.write(_out, value);
	}
}
