package trafficDescriptor;

/**
 *	Generated from IDL definition of alias "TrafficParameterList_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficParameterList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, globaldefs.NameAndStringValue_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static globaldefs.NameAndStringValue_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(trafficDescriptor.TrafficParameterList_THelper.id(), "TrafficParameterList_T",globaldefs.NVSList_THelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trafficDescriptor/TrafficParameterList_T:1.0";
	}
	public static globaldefs.NameAndStringValue_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		globaldefs.NameAndStringValue_T[] _result;
		_result = globaldefs.NVSList_THelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, globaldefs.NameAndStringValue_T[] _s)
	{
		globaldefs.NVSList_THelper.write(_out,_s);
	}
}
