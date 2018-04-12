package HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_LinkAggregationGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_LinkAggregationGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_LinkAggregationGroupIterator_I value;
	public HW_LinkAggregationGroupIterator_IHolder()
	{
	}
	public HW_LinkAggregationGroupIterator_IHolder (final HW_LinkAggregationGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_LinkAggregationGroupIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_LinkAggregationGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_LinkAggregationGroupIterator_IHelper.write (_out,value);
	}
}
