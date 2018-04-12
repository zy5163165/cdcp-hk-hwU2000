package flowDomain;

/**
 *	Generated from IDL definition of alias "MFDList_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, flowDomain.MatrixFlowDomain_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static flowDomain.MatrixFlowDomain_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(flowDomain.MFDList_THelper.id(), "MFDList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, flowDomain.MatrixFlowDomain_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/MFDList_T:1.0";
	}
	public static flowDomain.MatrixFlowDomain_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		flowDomain.MatrixFlowDomain_T[] _result;
		int _l_result31 = _in.read_long();
		_result = new flowDomain.MatrixFlowDomain_T[_l_result31];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=flowDomain.MatrixFlowDomain_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, flowDomain.MatrixFlowDomain_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			flowDomain.MatrixFlowDomain_THelper.write(_out,_s[i]);
		}

	}
}
