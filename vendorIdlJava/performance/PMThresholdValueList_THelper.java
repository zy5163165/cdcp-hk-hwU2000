package performance;

/**
 *	Generated from IDL definition of alias "PMThresholdValueList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdValueList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, performance.PMThresholdValue_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static performance.PMThresholdValue_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(performance.PMThresholdValueList_THelper.id(), "PMThresholdValueList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, performance.PMThresholdValue_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMThresholdValueList_T:1.0";
	}
	public static performance.PMThresholdValue_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		performance.PMThresholdValue_T[] _result;
		int _l_result103 = _in.read_long();
		_result = new performance.PMThresholdValue_T[_l_result103];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=performance.PMThresholdValue_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, performance.PMThresholdValue_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			performance.PMThresholdValue_THelper.write(_out,_s[i]);
		}

	}
}
