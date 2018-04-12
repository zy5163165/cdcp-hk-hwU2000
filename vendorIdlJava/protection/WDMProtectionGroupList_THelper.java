package protection;

/**
 *	Generated from IDL definition of alias "WDMProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMProtectionGroupList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.WDMProtectionGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.WDMProtectionGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.WDMProtectionGroupList_THelper.id(), "WDMProtectionGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.WDMProtectionGroup_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/WDMProtectionGroupList_T:1.0";
	}
	public static protection.WDMProtectionGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.WDMProtectionGroup_T[] _result;
		int _l_result118 = _in.read_long();
		_result = new protection.WDMProtectionGroup_T[_l_result118];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=protection.WDMProtectionGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.WDMProtectionGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			protection.WDMProtectionGroup_THelper.write(_out,_s[i]);
		}

	}
}
