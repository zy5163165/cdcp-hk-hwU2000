package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ObjectIDList"
 *	@author JacORB IDL compiler 
 */

public final class ObjectIDListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, int[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static int[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, circuitCutMgr.ObjectIDHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ObjectIDList:1.0";
	}
	public static int[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		int[] _result;
		int _l_result0 = _in.read_long();
		_result = new int[_l_result0];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_ulong();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, int[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_ulong(_s[i]);
		}

	}
}
