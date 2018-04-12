package protection;

/**
 *	Generated from IDL definition of alias "ProtectionSubnetworkCircle_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetworkCircle_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.ProtectionSubnetworkLink_T[][] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.ProtectionSubnetworkLink_T[][] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.ProtectionSubnetworkCircle_THelper.id(), "ProtectionSubnetworkCircle_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.ProtectionSubnetworkSection_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetworkCircle_T:1.0";
	}
	public static protection.ProtectionSubnetworkLink_T[][] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.ProtectionSubnetworkLink_T[][] _result;
		int _l_result115 = _in.read_long();
		_result = new protection.ProtectionSubnetworkLink_T[_l_result115][];
		for (int i=0;i<_result.length;i++)
		{
			_result[i] = protection.ProtectionSubnetworkSection_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.ProtectionSubnetworkLink_T[][] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			protection.ProtectionSubnetworkSection_THelper.write(_out,_s[i]);
		}

	}
}
