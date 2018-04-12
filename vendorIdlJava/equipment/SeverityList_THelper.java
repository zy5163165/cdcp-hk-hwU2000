package equipment;

/**
 *	Generated from IDL definition of alias "SeverityList_T"
 *	@author JacORB IDL compiler 
 */

public final class SeverityList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, equipment.Severity_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static equipment.Severity_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(equipment.SeverityList_THelper.id(), "SeverityList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, equipment.Severity_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/SeverityList_T:1.0";
	}
	public static equipment.Severity_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		equipment.Severity_T[] _result;
		int _l_result28 = _in.read_long();
		_result = new equipment.Severity_T[_l_result28];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=equipment.Severity_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, equipment.Severity_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			equipment.Severity_THelper.write(_out,_s[i]);
		}

	}
}
