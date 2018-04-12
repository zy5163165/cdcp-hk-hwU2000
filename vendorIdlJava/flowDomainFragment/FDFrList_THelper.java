package flowDomainFragment;

/**
 *	Generated from IDL definition of alias "FDFrList_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, flowDomainFragment.FlowDomainFragment_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static flowDomainFragment.FlowDomainFragment_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(flowDomainFragment.FDFrList_THelper.id(), "FDFrList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, flowDomainFragment.FlowDomainFragment_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment/FDFrList_T:1.0";
	}
	public static flowDomainFragment.FlowDomainFragment_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		flowDomainFragment.FlowDomainFragment_T[] _result;
		int _l_result35 = _in.read_long();
		_result = new flowDomainFragment.FlowDomainFragment_T[_l_result35];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=flowDomainFragment.FlowDomainFragment_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, flowDomainFragment.FlowDomainFragment_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			flowDomainFragment.FlowDomainFragment_THelper.write(_out,_s[i]);
		}

	}
}
