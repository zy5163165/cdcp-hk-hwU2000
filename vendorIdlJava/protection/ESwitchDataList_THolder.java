package protection;

/**
 *	Generated from IDL definition of alias "ESwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.ESwitchData_T[] value;

	public ESwitchDataList_THolder ()
	{
	}
	public ESwitchDataList_THolder (final protection.ESwitchData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ESwitchDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ESwitchDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ESwitchDataList_THelper.write (out,value);
	}
}
