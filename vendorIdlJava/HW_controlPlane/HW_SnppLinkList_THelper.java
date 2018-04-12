package HW_controlPlane;

/**
 *	Generated from IDL definition of alias "HW_SnppLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SnppLinkList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, HW_controlPlane.HW_SnppLink_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static HW_controlPlane.HW_SnppLink_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(HW_controlPlane.HW_SnppLinkList_THelper.id(), "HW_SnppLinkList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, HW_controlPlane.HW_SnppLink_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_controlPlane/HW_SnppLinkList_T:1.0";
	}
	public static HW_controlPlane.HW_SnppLink_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		HW_controlPlane.HW_SnppLink_T[] _result;
		int _l_result42 = _in.read_long();
		_result = new HW_controlPlane.HW_SnppLink_T[_l_result42];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=HW_controlPlane.HW_SnppLink_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, HW_controlPlane.HW_SnppLink_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			HW_controlPlane.HW_SnppLink_THelper.write(_out,_s[i]);
		}

	}
}
