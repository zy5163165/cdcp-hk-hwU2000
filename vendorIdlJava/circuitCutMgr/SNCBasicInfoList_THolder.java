package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "SNCBasicInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCBasicInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.SNCBasicInfo_T[] value;

	public SNCBasicInfoList_THolder ()
	{
	}
	public SNCBasicInfoList_THolder (final circuitCutMgr.SNCBasicInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCBasicInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCBasicInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCBasicInfoList_THelper.write (out,value);
	}
}
