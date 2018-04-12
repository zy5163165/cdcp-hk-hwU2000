package flowDomain;


/**
 *	Generated from IDL definition of struct "EthernetOAMPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPoint_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(flowDomain.EthernetOAMPoint_THelper.id(),"EthernetOAMPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("Name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", flowDomain.EthernetOAMPointType_THelper.type(), null),new org.omg.CORBA.StructMember("direction", flowDomain.EthernetOAMPointDirection_THelper.type(), null),new org.omg.CORBA.StructMember("level", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.EthernetOAMPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.EthernetOAMPoint_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMPoint_T:1.0";
	}
	public static flowDomain.EthernetOAMPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomain.EthernetOAMPoint_T result = new flowDomain.EthernetOAMPoint_T();
		result.Name=in.read_string();
		result.type=flowDomain.EthernetOAMPointType_THelper.read(in);
		result.direction=flowDomain.EthernetOAMPointDirection_THelper.read(in);
		result.level=in.read_ulong();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomain.EthernetOAMPoint_T s)
	{
		out.write_string(s.Name);
		flowDomain.EthernetOAMPointType_THelper.write(out,s.type);
		flowDomain.EthernetOAMPointDirection_THelper.write(out,s.direction);
		out.write_ulong(s.level);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
