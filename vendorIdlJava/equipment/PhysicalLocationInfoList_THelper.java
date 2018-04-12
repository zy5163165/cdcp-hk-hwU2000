package equipment;

/**
 *	Generated from IDL definition of alias "PhysicalLocationInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class PhysicalLocationInfoList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, equipment.PhysicalLocationInfo_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static equipment.PhysicalLocationInfo_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(equipment.PhysicalLocationInfoList_THelper.id(), "PhysicalLocationInfoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, equipment.PhysicalLocationInfo_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/PhysicalLocationInfoList_T:1.0";
	}
	public static equipment.PhysicalLocationInfo_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		equipment.PhysicalLocationInfo_T[] _result;
		int _l_result26 = _in.read_long();
		_result = new equipment.PhysicalLocationInfo_T[_l_result26];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=equipment.PhysicalLocationInfo_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, equipment.PhysicalLocationInfo_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			equipment.PhysicalLocationInfo_THelper.write(_out,_s[i]);
		}

	}
}
