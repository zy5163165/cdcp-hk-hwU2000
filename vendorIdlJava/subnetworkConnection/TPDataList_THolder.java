package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "TPDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class TPDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.TPData_T[] value;

	public TPDataList_THolder ()
	{
	}
	public TPDataList_THolder (final subnetworkConnection.TPData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPDataList_THelper.write (out,value);
	}
}
