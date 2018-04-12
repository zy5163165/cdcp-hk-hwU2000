package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "WaveLengthStatusList_T"
 *	@author JacORB IDL compiler 
 */

public final class WaveLengthStatusList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, subnetworkConnection.WaveLengthStatus_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static subnetworkConnection.WaveLengthStatus_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(subnetworkConnection.WaveLengthStatusList_THelper.id(), "WaveLengthStatusList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, subnetworkConnection.WaveLengthStatus_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/WaveLengthStatusList_T:1.0";
	}
	public static subnetworkConnection.WaveLengthStatus_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		subnetworkConnection.WaveLengthStatus_T[] _result;
		int _l_result135 = _in.read_long();
		_result = new subnetworkConnection.WaveLengthStatus_T[_l_result135];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=subnetworkConnection.WaveLengthStatus_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, subnetworkConnection.WaveLengthStatus_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			subnetworkConnection.WaveLengthStatus_THelper.write(_out,_s[i]);
		}

	}
}
