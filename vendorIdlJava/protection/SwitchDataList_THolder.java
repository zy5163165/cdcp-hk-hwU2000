package protection;

/**
 *	Generated from IDL definition of alias "SwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public protection.SwitchData_T[] value;

	public SwitchDataList_THolder ()
	{
	}
	public SwitchDataList_THolder (final protection.SwitchData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SwitchDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SwitchDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SwitchDataList_THelper.write (out,value);
	}
}
