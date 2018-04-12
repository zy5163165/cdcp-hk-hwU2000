package HW_mstpInventory;

/**
 *	Generated from IDL definition of alias "HW_VirtualLANList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_VirtualLANList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, HW_mstpInventory.HW_VirtualLAN_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static HW_mstpInventory.HW_VirtualLAN_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(HW_mstpInventory.HW_VirtualLANList_THelper.id(), "HW_VirtualLANList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, HW_mstpInventory.HW_VirtualLAN_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_VirtualLANList_T:1.0";
	}
	public static HW_mstpInventory.HW_VirtualLAN_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		HW_mstpInventory.HW_VirtualLAN_T[] _result;
		int _l_result51 = _in.read_long();
		_result = new HW_mstpInventory.HW_VirtualLAN_T[_l_result51];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=HW_mstpInventory.HW_VirtualLAN_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, HW_mstpInventory.HW_VirtualLAN_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			HW_mstpInventory.HW_VirtualLAN_THelper.write(_out,_s[i]);
		}

	}
}
