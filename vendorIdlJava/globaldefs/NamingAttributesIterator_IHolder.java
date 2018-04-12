package globaldefs;

/**
 *	Generated from IDL interface "NamingAttributesIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class NamingAttributesIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public NamingAttributesIterator_I value;
	public NamingAttributesIterator_IHolder()
	{
	}
	public NamingAttributesIterator_IHolder (final NamingAttributesIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NamingAttributesIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingAttributesIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NamingAttributesIterator_IHelper.write (_out,value);
	}
}
