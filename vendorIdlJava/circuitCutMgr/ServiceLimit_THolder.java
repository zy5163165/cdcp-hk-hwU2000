package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ServiceLimit_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceLimit_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.ServiceLimit_T value;

	public ServiceLimit_THolder ()
	{
	}
	public ServiceLimit_THolder(final circuitCutMgr.ServiceLimit_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.ServiceLimit_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.ServiceLimit_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.ServiceLimit_THelper.write(_out, value);
	}
}
