package HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_QosRuleIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_QosRuleIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_QosRuleIterator_I value;
	public HW_QosRuleIterator_IHolder()
	{
	}
	public HW_QosRuleIterator_IHolder (final HW_QosRuleIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_QosRuleIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_QosRuleIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_QosRuleIterator_IHelper.write (_out,value);
	}
}
