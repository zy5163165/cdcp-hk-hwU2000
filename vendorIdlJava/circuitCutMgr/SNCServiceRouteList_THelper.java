package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "SNCServiceRouteList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCServiceRouteList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, circuitCutMgr.SNCServiceRoute_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static circuitCutMgr.SNCServiceRoute_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(circuitCutMgr.SNCServiceRouteList_THelper.id(), "SNCServiceRouteList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, circuitCutMgr.SNCServiceRoute_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCServiceRouteList_T:1.0";
	}
	public static circuitCutMgr.SNCServiceRoute_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		circuitCutMgr.SNCServiceRoute_T[] _result;
		int _l_result7 = _in.read_long();
		_result = new circuitCutMgr.SNCServiceRoute_T[_l_result7];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=circuitCutMgr.SNCServiceRoute_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, circuitCutMgr.SNCServiceRoute_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			circuitCutMgr.SNCServiceRoute_THelper.write(_out,_s[i]);
		}

	}
}
