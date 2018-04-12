package TopoManagementManager;

/**
 *	Generated from IDL definition of alias "NodeList_T"
 *	@author JacORB IDL compiler 
 */

public final class NodeList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, TopoManagementManager.Node_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static TopoManagementManager.Node_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(TopoManagementManager.NodeList_THelper.id(), "NodeList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, TopoManagementManager.Node_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/TopoManagementManager/NodeList_T:1.0";
	}
	public static TopoManagementManager.Node_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		TopoManagementManager.Node_T[] _result;
		int _l_result138 = _in.read_long();
		_result = new TopoManagementManager.Node_T[_l_result138];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=TopoManagementManager.Node_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, TopoManagementManager.Node_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			TopoManagementManager.Node_THelper.write(_out,_s[i]);
		}

	}
}
