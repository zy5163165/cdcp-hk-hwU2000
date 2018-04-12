package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ServiceTrailSequence_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceTrailSequence_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ProtectServiceTrail_T[] value;

	public ServiceTrailSequence_THolder ()
	{
	}
	public ServiceTrailSequence_THolder (final circuitCutMgr.ProtectServiceTrail_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceTrailSequence_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceTrailSequence_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceTrailSequence_THelper.write (out,value);
	}
}
