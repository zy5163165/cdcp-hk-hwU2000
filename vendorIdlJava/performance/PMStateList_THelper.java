package performance;

/**
 *	Generated from IDL definition of alias "PMStateList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMStateList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, performance.PMState_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static performance.PMState_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(performance.PMStateList_THelper.id(), "PMStateList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, performance.PMState_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMStateList_T:1.0";
	}
	public static performance.PMState_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		performance.PMState_T[] _result;
		int _l_result107 = _in.read_long();
		_result = new performance.PMState_T[_l_result107];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=performance.PMState_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, performance.PMState_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			performance.PMState_THelper.write(_out,_s[i]);
		}

	}
}
