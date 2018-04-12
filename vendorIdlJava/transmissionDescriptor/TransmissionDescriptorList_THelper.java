package transmissionDescriptor;

/**
 *	Generated from IDL definition of alias "TransmissionDescriptorList_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionDescriptorList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, transmissionDescriptor.TransmissionDescriptor_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static transmissionDescriptor.TransmissionDescriptor_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(transmissionDescriptor.TransmissionDescriptorList_THelper.id(), "TransmissionDescriptorList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, transmissionDescriptor.TransmissionDescriptor_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/TransmissionDescriptorList_T:1.0";
	}
	public static transmissionDescriptor.TransmissionDescriptor_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		transmissionDescriptor.TransmissionDescriptor_T[] _result;
		int _l_result146 = _in.read_long();
		_result = new transmissionDescriptor.TransmissionDescriptor_T[_l_result146];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=transmissionDescriptor.TransmissionDescriptor_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, transmissionDescriptor.TransmissionDescriptor_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_s[i]);
		}

	}
}
