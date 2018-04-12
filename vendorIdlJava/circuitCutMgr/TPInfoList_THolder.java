package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "TPInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class TPInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.TPInfo_T[] value;

	public TPInfoList_THolder ()
	{
	}
	public TPInfoList_THolder (final circuitCutMgr.TPInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPInfoList_THelper.write (out,value);
	}
}
