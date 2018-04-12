package HW_mstpProtection;

/**
 *	Generated from IDL definition of alias "HW_RPRNodeList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRNodeList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, HW_mstpProtection.HW_RPRNode_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static HW_mstpProtection.HW_RPRNode_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(HW_mstpProtection.HW_RPRNodeList_THelper.id(), "HW_RPRNodeList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, HW_mstpProtection.HW_RPRNode_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_RPRNodeList_T:1.0";
	}
	public static HW_mstpProtection.HW_RPRNode_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		HW_mstpProtection.HW_RPRNode_T[] _result;
		int _l_result59 = _in.read_long();
		_result = new HW_mstpProtection.HW_RPRNode_T[_l_result59];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=HW_mstpProtection.HW_RPRNode_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, HW_mstpProtection.HW_RPRNode_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			HW_mstpProtection.HW_RPRNode_THelper.write(_out,_s[i]);
		}

	}
}
