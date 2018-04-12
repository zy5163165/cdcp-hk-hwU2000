package trafficConditioningProfile;

/**
 *	Generated from IDL definition of alias "TrafficConditioningProfileDeassignList_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileDeassignList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(trafficConditioningProfile.TrafficConditioningProfileDeassignList_THelper.id(), "TrafficConditioningProfileDeassignList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, trafficConditioningProfile.TrafficConditioningProfileDeassign_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trafficConditioningProfile/TrafficConditioningProfileDeassignList_T:1.0";
	}
	public static trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] _result;
		int _l_result142 = _in.read_long();
		_result = new trafficConditioningProfile.TrafficConditioningProfileDeassign_T[_l_result142];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=trafficConditioningProfile.TrafficConditioningProfileDeassign_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			trafficConditioningProfile.TrafficConditioningProfileDeassign_THelper.write(_out,_s[i]);
		}

	}
}
