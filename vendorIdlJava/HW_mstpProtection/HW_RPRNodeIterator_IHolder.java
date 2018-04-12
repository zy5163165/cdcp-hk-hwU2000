package HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_RPRNodeIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_RPRNodeIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_RPRNodeIterator_I value;
	public HW_RPRNodeIterator_IHolder()
	{
	}
	public HW_RPRNodeIterator_IHolder (final HW_RPRNodeIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_RPRNodeIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_RPRNodeIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_RPRNodeIterator_IHelper.write (_out,value);
	}
}
