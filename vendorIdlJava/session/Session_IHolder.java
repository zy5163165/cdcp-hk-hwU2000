package session;

/**
 *	Generated from IDL interface "Session_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class Session_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public Session_I value;
	public Session_IHolder()
	{
	}
	public Session_IHolder (final Session_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return Session_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Session_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		Session_IHelper.write (_out,value);
	}
}
