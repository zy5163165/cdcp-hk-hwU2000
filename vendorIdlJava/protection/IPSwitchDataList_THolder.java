package protection;

/**
 *	Generated from IDL definition of alias "IPSwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class IPSwitchDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.IPSwitchData_T[] value;

	public IPSwitchDataList_THolder ()
	{
	}
	public IPSwitchDataList_THolder (final protection.IPSwitchData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IPSwitchDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPSwitchDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IPSwitchDataList_THelper.write (out,value);
	}
}
