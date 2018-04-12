package performance;

/**
 *	Generated from IDL definition of alias "CollectTaskInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class CollectTaskInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.CollectTaskInfo_T[] value;

	public CollectTaskInfoList_THolder ()
	{
	}
	public CollectTaskInfoList_THolder (final performance.CollectTaskInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CollectTaskInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectTaskInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CollectTaskInfoList_THelper.write (out,value);
	}
}
