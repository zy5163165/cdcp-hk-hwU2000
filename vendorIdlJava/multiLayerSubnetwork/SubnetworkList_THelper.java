package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "SubnetworkList_T"
 *	@author JacORB IDL compiler 
 */

public final class SubnetworkList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, multiLayerSubnetwork.MultiLayerSubnetwork_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static multiLayerSubnetwork.MultiLayerSubnetwork_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(multiLayerSubnetwork.SubnetworkList_THelper.id(), "SubnetworkList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, multiLayerSubnetwork.MultiLayerSubnetwork_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/SubnetworkList_T:1.0";
	}
	public static multiLayerSubnetwork.MultiLayerSubnetwork_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		multiLayerSubnetwork.MultiLayerSubnetwork_T[] _result;
		int _l_result90 = _in.read_long();
		_result = new multiLayerSubnetwork.MultiLayerSubnetwork_T[_l_result90];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, multiLayerSubnetwork.MultiLayerSubnetwork_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out,_s[i]);
		}

	}
}
