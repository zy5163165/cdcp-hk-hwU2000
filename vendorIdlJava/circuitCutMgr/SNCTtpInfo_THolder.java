package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "SNCTtpInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCTtpInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.SNCTtpInfo_T value;

	public SNCTtpInfo_THolder ()
	{
	}
	public SNCTtpInfo_THolder(final circuitCutMgr.SNCTtpInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.SNCTtpInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.SNCTtpInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.SNCTtpInfo_THelper.write(_out, value);
	}
}
