package emsMgr;

/**
 *	Generated from IDL definition of alias "ServiceNameList_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceNameList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.ServiceName_T[] value;

	public ServiceNameList_THolder ()
	{
	}
	public ServiceNameList_THolder (final emsMgr.ServiceName_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceNameList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceNameList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceNameList_THelper.write (out,value);
	}
}
