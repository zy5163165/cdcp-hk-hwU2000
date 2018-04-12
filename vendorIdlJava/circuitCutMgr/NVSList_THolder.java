package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "NVSList_T"
 *	@author JacORB IDL compiler 
 */

public final class NVSList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.NameAndStringValue_T[] value;

	public NVSList_THolder ()
	{
	}
	public NVSList_THolder (final circuitCutMgr.NameAndStringValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NVSList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NVSList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NVSList_THelper.write (out,value);
	}
}
