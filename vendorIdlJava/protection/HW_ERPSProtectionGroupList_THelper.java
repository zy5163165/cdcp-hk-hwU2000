package protection;

/**
 *	Generated from IDL definition of alias "HW_ERPSProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ERPSProtectionGroupList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.HW_ERPSProtectionGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.HW_ERPSProtectionGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.HW_ERPSProtectionGroupList_THelper.id(), "HW_ERPSProtectionGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.HW_ERPSProtectionGroup_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/HW_ERPSProtectionGroupList_T:1.0";
	}
	public static protection.HW_ERPSProtectionGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.HW_ERPSProtectionGroup_T[] _result;
		int _l_result125 = _in.read_long();
		_result = new protection.HW_ERPSProtectionGroup_T[_l_result125];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=protection.HW_ERPSProtectionGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.HW_ERPSProtectionGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			protection.HW_ERPSProtectionGroup_THelper.write(_out,_s[i]);
		}

	}
}
