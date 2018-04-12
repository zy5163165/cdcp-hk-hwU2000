package protection;

/**
 *	Generated from IDL interface "HW_XPICGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_XPICGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_XPICGroupIterator_I value;
	public HW_XPICGroupIterator_IHolder()
	{
	}
	public HW_XPICGroupIterator_IHolder (final HW_XPICGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_XPICGroupIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_XPICGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_XPICGroupIterator_IHelper.write (_out,value);
	}
}
