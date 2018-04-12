package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "TtpDirection"
 *	@author JacORB IDL compiler 
 */

public final class TtpDirectionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public TtpDirection value;

	public TtpDirectionHolder ()
	{
	}
	public TtpDirectionHolder (final TtpDirection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TtpDirectionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TtpDirectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TtpDirectionHelper.write (out,value);
	}
}
