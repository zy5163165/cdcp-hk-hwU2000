package trafficDescriptor;

/**
 *	Generated from IDL definition of alias "TrafficDescriptorList_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptorList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, trafficDescriptor.TrafficDescriptor_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static trafficDescriptor.TrafficDescriptor_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(trafficDescriptor.TrafficDescriptorList_THelper.id(), "TrafficDescriptorList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, trafficDescriptor.TrafficDescriptor_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trafficDescriptor/TrafficDescriptorList_T:1.0";
	}
	public static trafficDescriptor.TrafficDescriptor_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		trafficDescriptor.TrafficDescriptor_T[] _result;
		int _l_result144 = _in.read_long();
		_result = new trafficDescriptor.TrafficDescriptor_T[_l_result144];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=trafficDescriptor.TrafficDescriptor_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, trafficDescriptor.TrafficDescriptor_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			trafficDescriptor.TrafficDescriptor_THelper.write(_out,_s[i]);
		}

	}
}
