package flowDomain;


/**
 *	Generated from IDL definition of struct "EthernetLTTestResult_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetLTTestResult_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(flowDomain.EthernetLTTestResult_THelper.id(),"EthernetLTTestResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("oamPointName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("hopNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("result", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.EthernetLTTestResult_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.EthernetLTTestResult_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetLTTestResult_T:1.0";
	}
	public static flowDomain.EthernetLTTestResult_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomain.EthernetLTTestResult_T result = new flowDomain.EthernetLTTestResult_T();
		result.oamPointName=in.read_string();
		result.hopNumber=in.read_ulong();
		result.result=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomain.EthernetLTTestResult_T s)
	{
		out.write_string(s.oamPointName);
		out.write_ulong(s.hopNumber);
		out.write_boolean(s.result);
	}
}
