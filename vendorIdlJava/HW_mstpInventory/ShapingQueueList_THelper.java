package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "ShapingQueueList_T"
 *	@author JacORB IDL compiler 
 */

public final class ShapingQueueList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, HW_mstpInventory.ShapingQueue[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static HW_mstpInventory.ShapingQueue[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(HW_mstpInventory.ShapingQueueList_THelper.id(), "ShapingQueueList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, HW_mstpInventory.ShapingQueueHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/ShapingQueueList_T:1.0";
	}
	public static HW_mstpInventory.ShapingQueue[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		HW_mstpInventory.ShapingQueue[] _result;
		int _l_result56 = _in.read_long();
		_result = new HW_mstpInventory.ShapingQueue[_l_result56];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=HW_mstpInventory.ShapingQueueHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, HW_mstpInventory.ShapingQueue[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			HW_mstpInventory.ShapingQueueHelper.write(_out,_s[i]);
		}

	}
}
