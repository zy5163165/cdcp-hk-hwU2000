package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ErrorReasonList_T"
 *	@author JacORB IDL compiler 
 */

public final class ErrorReasonList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, circuitCutMgr.ErrorReason_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static circuitCutMgr.ErrorReason_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(circuitCutMgr.ErrorReasonList_THelper.id(), "ErrorReasonList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, circuitCutMgr.ErrorReason_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ErrorReasonList_T:1.0";
	}
	public static circuitCutMgr.ErrorReason_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		circuitCutMgr.ErrorReason_T[] _result;
		int _l_result9 = _in.read_long();
		_result = new circuitCutMgr.ErrorReason_T[_l_result9];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=circuitCutMgr.ErrorReason_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, circuitCutMgr.ErrorReason_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			circuitCutMgr.ErrorReason_THelper.write(_out,_s[i]);
		}

	}
}
