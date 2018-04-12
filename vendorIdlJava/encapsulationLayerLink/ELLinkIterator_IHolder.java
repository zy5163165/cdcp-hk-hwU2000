package encapsulationLayerLink;

/**
 *	Generated from IDL interface "ELLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ELLinkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ELLinkIterator_I value;
	public ELLinkIterator_IHolder()
	{
	}
	public ELLinkIterator_IHolder (final ELLinkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ELLinkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ELLinkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ELLinkIterator_IHelper.write (_out,value);
	}
}
