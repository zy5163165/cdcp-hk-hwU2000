package maintenanceOps;

/**
 *	Generated from IDL definition of alias "SampleResultList_T"
 *	@author JacORB IDL compiler 
 */

public final class SampleResultList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, maintenanceOps.SampleResult_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static maintenanceOps.SampleResult_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(maintenanceOps.SampleResultList_THelper.id(), "SampleResultList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, maintenanceOps.SampleResult_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/SampleResultList_T:1.0";
	}
	public static maintenanceOps.SampleResult_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		maintenanceOps.SampleResult_T[] _result;
		int _l_result82 = _in.read_long();
		_result = new maintenanceOps.SampleResult_T[_l_result82];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=maintenanceOps.SampleResult_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, maintenanceOps.SampleResult_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			maintenanceOps.SampleResult_THelper.write(_out,_s[i]);
		}

	}
}
