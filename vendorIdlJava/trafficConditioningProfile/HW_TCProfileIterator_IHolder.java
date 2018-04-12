package trafficConditioningProfile;

/**
 *	Generated from IDL interface "HW_TCProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_TCProfileIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_TCProfileIterator_I value;
	public HW_TCProfileIterator_IHolder()
	{
	}
	public HW_TCProfileIterator_IHolder (final HW_TCProfileIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_TCProfileIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_TCProfileIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_TCProfileIterator_IHelper.write (_out,value);
	}
}
