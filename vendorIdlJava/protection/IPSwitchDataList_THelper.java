package protection;

/**
 *	Generated from IDL definition of alias "IPSwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class IPSwitchDataList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.IPSwitchData_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.IPSwitchData_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.IPSwitchDataList_THelper.id(), "IPSwitchDataList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.IPSwitchData_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/IPSwitchDataList_T:1.0";
	}
	public static protection.IPSwitchData_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.IPSwitchData_T[] _result;
		int _l_result121 = _in.read_long();
		_result = new protection.IPSwitchData_T[_l_result121];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=protection.IPSwitchData_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.IPSwitchData_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			protection.IPSwitchData_THelper.write(_out,_s[i]);
		}

	}
}
