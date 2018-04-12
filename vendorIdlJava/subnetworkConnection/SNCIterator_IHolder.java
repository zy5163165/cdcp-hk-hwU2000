package subnetworkConnection;

/**
 *	Generated from IDL interface "SNCIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class SNCIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public SNCIterator_I value;
	public SNCIterator_IHolder()
	{
	}
	public SNCIterator_IHolder (final SNCIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SNCIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SNCIterator_IHelper.write (_out,value);
	}
}
