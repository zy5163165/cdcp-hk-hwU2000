package HW_mstpInventory;


/**
 *	Generated from IDL interface "HW_FlowIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_FlowIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final HW_mstpInventory.HW_FlowIterator_I s)
	{
			any.insert_Object(s);
	}
	public static HW_mstpInventory.HW_FlowIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.huawei.com/HW_mstpInventory/HW_FlowIterator_I:1.0", "HW_FlowIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_FlowIterator_I:1.0";
	}
	public static HW_FlowIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final HW_mstpInventory.HW_FlowIterator_I s)
	{
		_out.write_Object(s);
	}
	public static HW_mstpInventory.HW_FlowIterator_I narrow(final java.lang.Object obj)
	{
		if (obj instanceof HW_mstpInventory.HW_FlowIterator_I)
		{
			return (HW_mstpInventory.HW_FlowIterator_I)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static HW_mstpInventory.HW_FlowIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (HW_mstpInventory.HW_FlowIterator_I)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:mtnm.huawei.com/HW_mstpInventory/HW_FlowIterator_I:1.0"))
			{
				HW_mstpInventory._HW_FlowIterator_IStub stub;
				stub = new HW_mstpInventory._HW_FlowIterator_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static HW_mstpInventory.HW_FlowIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (HW_mstpInventory.HW_FlowIterator_I)obj;
		}
		catch (ClassCastException c)
		{
				HW_mstpInventory._HW_FlowIterator_IStub stub;
				stub = new HW_mstpInventory._HW_FlowIterator_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
