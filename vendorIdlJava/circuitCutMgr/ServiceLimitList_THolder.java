package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ServiceLimitList_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceLimitList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ServiceLimit_T[] value;

	public ServiceLimitList_THolder ()
	{
	}
	public ServiceLimitList_THolder (final circuitCutMgr.ServiceLimit_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceLimitList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceLimitList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceLimitList_THelper.write (out,value);
	}
}
