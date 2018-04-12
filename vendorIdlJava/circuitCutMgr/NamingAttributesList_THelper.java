package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "NamingAttributesList_T"
 *	@author JacORB IDL compiler 
 */

public final class NamingAttributesList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, circuitCutMgr.NameAndStringValue_T[][] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static circuitCutMgr.NameAndStringValue_T[][] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(circuitCutMgr.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, circuitCutMgr.NamingAttributes_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/NamingAttributesList_T:1.0";
	}
	public static circuitCutMgr.NameAndStringValue_T[][] read (final org.omg.CORBA.portable.InputStream _in)
	{
		circuitCutMgr.NameAndStringValue_T[][] _result;
		int _l_result2 = _in.read_long();
		_result = new circuitCutMgr.NameAndStringValue_T[_l_result2][];
		for (int i=0;i<_result.length;i++)
		{
			_result[i] = circuitCutMgr.NVSList_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, circuitCutMgr.NameAndStringValue_T[][] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			circuitCutMgr.NVSList_THelper.write(_out,_s[i]);
		}

	}
}
