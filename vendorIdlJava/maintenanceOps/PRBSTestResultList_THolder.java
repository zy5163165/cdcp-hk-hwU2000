package maintenanceOps;

/**
 *	Generated from IDL definition of alias "PRBSTestResultList_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestResultList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.PRBSTestResult_T[] value;

	public PRBSTestResultList_THolder ()
	{
	}
	public PRBSTestResultList_THolder (final maintenanceOps.PRBSTestResult_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PRBSTestResultList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PRBSTestResultList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PRBSTestResultList_THelper.write (out,value);
	}
}
