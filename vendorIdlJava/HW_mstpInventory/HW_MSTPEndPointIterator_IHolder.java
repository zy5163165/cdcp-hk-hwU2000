package HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_MSTPEndPointIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_MSTPEndPointIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MSTPEndPointIterator_I value;
	public HW_MSTPEndPointIterator_IHolder()
	{
	}
	public HW_MSTPEndPointIterator_IHolder (final HW_MSTPEndPointIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MSTPEndPointIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MSTPEndPointIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MSTPEndPointIterator_IHelper.write (_out,value);
	}
}
