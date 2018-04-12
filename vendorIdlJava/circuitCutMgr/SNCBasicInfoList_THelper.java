package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "SNCBasicInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCBasicInfoList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, circuitCutMgr.SNCBasicInfo_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static circuitCutMgr.SNCBasicInfo_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(circuitCutMgr.SNCBasicInfoList_THelper.id(), "SNCBasicInfoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, circuitCutMgr.SNCBasicInfo_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCBasicInfoList_T:1.0";
	}
	public static circuitCutMgr.SNCBasicInfo_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		circuitCutMgr.SNCBasicInfo_T[] _result;
		int _l_result8 = _in.read_long();
		_result = new circuitCutMgr.SNCBasicInfo_T[_l_result8];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=circuitCutMgr.SNCBasicInfo_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, circuitCutMgr.SNCBasicInfo_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			circuitCutMgr.SNCBasicInfo_THelper.write(_out,_s[i]);
		}

	}
}
