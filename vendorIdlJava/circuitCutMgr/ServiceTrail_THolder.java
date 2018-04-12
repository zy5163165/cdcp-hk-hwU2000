package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ServiceTrail_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceTrail_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ServiceTrail_T value;

	public ServiceTrail_THolder ()
	{
	}
	public ServiceTrail_THolder(final circuitCutMgr.ServiceTrail_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.ServiceTrail_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.ServiceTrail_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.ServiceTrail_THelper.write(_out, value);
	}
}
