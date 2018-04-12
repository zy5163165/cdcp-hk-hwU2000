package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "CrossConnectList_T"
 *	@author JacORB IDL compiler 
 */

public final class CrossConnectList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.CrossConnect_T[] value;

	public CrossConnectList_THolder ()
	{
	}
	public CrossConnectList_THolder (final subnetworkConnection.CrossConnect_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CrossConnectList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CrossConnectList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CrossConnectList_THelper.write (out,value);
	}
}
