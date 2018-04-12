package emsMgr;

/**
 *	Generated from IDL definition of struct "ServiceName_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceName_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.ServiceName_T value;

	public ServiceName_THolder ()
	{
	}
	public ServiceName_THolder(final emsMgr.ServiceName_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.ServiceName_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.ServiceName_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.ServiceName_THelper.write(_out, value);
	}
}
