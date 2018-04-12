package emsMgr;

/**
 *	Generated from IDL definition of struct "EndTPFaultStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class EndTPFaultStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.EndTPFaultStatus_T value;

	public EndTPFaultStatus_THolder ()
	{
	}
	public EndTPFaultStatus_THolder(final emsMgr.EndTPFaultStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.EndTPFaultStatus_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.EndTPFaultStatus_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.EndTPFaultStatus_THelper.write(_out, value);
	}
}
