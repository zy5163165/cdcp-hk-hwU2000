package HW_controlPlane;

/**
 *	Generated from IDL interface "HW_SnppLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_SnppLinkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_SnppLinkIterator_I value;
	public HW_SnppLinkIterator_IHolder()
	{
	}
	public HW_SnppLinkIterator_IHolder (final HW_SnppLinkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_SnppLinkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_SnppLinkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_SnppLinkIterator_IHelper.write (_out,value);
	}
}
