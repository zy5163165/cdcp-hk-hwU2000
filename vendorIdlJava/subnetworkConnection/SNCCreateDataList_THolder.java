package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "SNCCreateDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.SNCCreateData_T[] value;

	public SNCCreateDataList_THolder ()
	{
	}
	public SNCCreateDataList_THolder (final subnetworkConnection.SNCCreateData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCCreateDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCCreateDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCCreateDataList_THelper.write (out,value);
	}
}
