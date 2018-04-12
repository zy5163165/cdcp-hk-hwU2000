package HW_mstpService;

/**
 *	Generated from IDL interface "HW_AtmServiceIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_AtmServiceIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_AtmServiceIterator_I value;
	public HW_AtmServiceIterator_IHolder()
	{
	}
	public HW_AtmServiceIterator_IHolder (final HW_AtmServiceIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_AtmServiceIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmServiceIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_AtmServiceIterator_IHelper.write (_out,value);
	}
}
