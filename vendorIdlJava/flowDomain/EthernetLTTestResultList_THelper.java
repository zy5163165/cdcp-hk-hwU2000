package flowDomain;

/**
 *	Generated from IDL definition of alias "EthernetLTTestResultList_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetLTTestResultList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, flowDomain.EthernetLTTestResult_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static flowDomain.EthernetLTTestResult_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(flowDomain.EthernetLTTestResultList_THelper.id(), "EthernetLTTestResultList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, flowDomain.EthernetLTTestResult_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetLTTestResultList_T:1.0";
	}
	public static flowDomain.EthernetLTTestResult_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		flowDomain.EthernetLTTestResult_T[] _result;
		int _l_result33 = _in.read_long();
		_result = new flowDomain.EthernetLTTestResult_T[_l_result33];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=flowDomain.EthernetLTTestResult_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, flowDomain.EthernetLTTestResult_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			flowDomain.EthernetLTTestResult_THelper.write(_out,_s[i]);
		}

	}
}
