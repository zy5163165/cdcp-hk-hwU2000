package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ServiceTrailList_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceTrailList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ServiceTrail_T[] value;

	public ServiceTrailList_THolder ()
	{
	}
	public ServiceTrailList_THolder (final circuitCutMgr.ServiceTrail_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceTrailList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceTrailList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceTrailList_THelper.write (out,value);
	}
}
