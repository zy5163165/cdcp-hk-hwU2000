package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "IdlePortAndTSList_T"
 *	@author JacORB IDL compiler 
 */

public final class IdlePortAndTSList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.IdlePortAndTS_T[] value;

	public IdlePortAndTSList_THolder ()
	{
	}
	public IdlePortAndTSList_THolder (final circuitCutMgr.IdlePortAndTS_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IdlePortAndTSList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdlePortAndTSList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IdlePortAndTSList_THelper.write (out,value);
	}
}
