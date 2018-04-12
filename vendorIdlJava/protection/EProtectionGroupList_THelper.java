package protection;

/**
 *	Generated from IDL definition of alias "EProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class EProtectionGroupList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.EProtectionGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.EProtectionGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.EProtectionGroupList_THelper.id(), "EProtectionGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.EProtectionGroup_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/EProtectionGroupList_T:1.0";
	}
	public static protection.EProtectionGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.EProtectionGroup_T[] _result;
		int _l_result122 = _in.read_long();
		_result = new protection.EProtectionGroup_T[_l_result122];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=protection.EProtectionGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.EProtectionGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			protection.EProtectionGroup_THelper.write(_out,_s[i]);
		}

	}
}
