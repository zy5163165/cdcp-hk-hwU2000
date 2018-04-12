package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "ServiceTrailSequence_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceTrailSequence_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, circuitCutMgr.ProtectServiceTrail_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static circuitCutMgr.ProtectServiceTrail_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(circuitCutMgr.ServiceTrailSequence_THelper.id(), "ServiceTrailSequence_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, circuitCutMgr.ProtectServiceTrail_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ServiceTrailSequence_T:1.0";
	}
	public static circuitCutMgr.ProtectServiceTrail_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		circuitCutMgr.ProtectServiceTrail_T[] _result;
		int _l_result6 = _in.read_long();
		_result = new circuitCutMgr.ProtectServiceTrail_T[_l_result6];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=circuitCutMgr.ProtectServiceTrail_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, circuitCutMgr.ProtectServiceTrail_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			circuitCutMgr.ProtectServiceTrail_THelper.write(_out,_s[i]);
		}

	}
}
