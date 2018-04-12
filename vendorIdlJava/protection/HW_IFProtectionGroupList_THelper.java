package protection;

/**
 *	Generated from IDL definition of alias "HW_IFProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_IFProtectionGroupList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.HW_IFProtectionGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.HW_IFProtectionGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.HW_IFProtectionGroupList_THelper.id(), "HW_IFProtectionGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.HW_IFProtectionGroup_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/HW_IFProtectionGroupList_T:1.0";
	}
	public static protection.HW_IFProtectionGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.HW_IFProtectionGroup_T[] _result;
		int _l_result126 = _in.read_long();
		_result = new protection.HW_IFProtectionGroup_T[_l_result126];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=protection.HW_IFProtectionGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.HW_IFProtectionGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			protection.HW_IFProtectionGroup_THelper.write(_out,_s[i]);
		}

	}
}
