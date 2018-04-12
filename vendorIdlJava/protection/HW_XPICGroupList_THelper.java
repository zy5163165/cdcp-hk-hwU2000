package protection;

/**
 *	Generated from IDL definition of alias "HW_XPICGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_XPICGroupList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.HW_XPICGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.HW_XPICGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.HW_XPICGroupList_THelper.id(), "HW_XPICGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.HW_XPICGroup_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/HW_XPICGroupList_T:1.0";
	}
	public static protection.HW_XPICGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.HW_XPICGroup_T[] _result;
		int _l_result124 = _in.read_long();
		_result = new protection.HW_XPICGroup_T[_l_result124];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=protection.HW_XPICGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.HW_XPICGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			protection.HW_XPICGroup_THelper.write(_out,_s[i]);
		}

	}
}
