package HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_RPRLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_RPRLinkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_RPRLinkIterator_I value;
	public HW_RPRLinkIterator_IHolder()
	{
	}
	public HW_RPRLinkIterator_IHolder (final HW_RPRLinkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_RPRLinkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_RPRLinkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_RPRLinkIterator_IHelper.write (_out,value);
	}
}
