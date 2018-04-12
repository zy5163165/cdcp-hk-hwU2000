package trafficConditioningProfile;

/**
 *	Generated from IDL interface "TCProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class TCProfileIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TCProfileIterator_I value;
	public TCProfileIterator_IHolder()
	{
	}
	public TCProfileIterator_IHolder (final TCProfileIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TCProfileIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCProfileIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TCProfileIterator_IHelper.write (_out,value);
	}
}
