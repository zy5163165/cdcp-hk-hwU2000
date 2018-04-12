package mtnmVersion;

/**
 *	Generated from IDL interface "Version_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class Version_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public Version_I value;
	public Version_IHolder()
	{
	}
	public Version_IHolder (final Version_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return Version_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Version_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		Version_IHelper.write (_out,value);
	}
}
