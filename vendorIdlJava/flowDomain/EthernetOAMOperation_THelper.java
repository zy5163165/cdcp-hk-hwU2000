package flowDomain;


/**
 *	Generated from IDL definition of struct "EthernetOAMOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMOperation_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(flowDomain.EthernetOAMOperation_THelper.id(),"EthernetOAMOperation_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("command", flowDomain.EthernetOAMCommandType_THelper.type(), null),new org.omg.CORBA.StructMember("srcPoint", flowDomain.EthernetOAMParamer_THelper.type(), null),new org.omg.CORBA.StructMember("snkPoint", flowDomain.EthernetOAMParamer_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.EthernetOAMOperation_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.EthernetOAMOperation_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMOperation_T:1.0";
	}
	public static flowDomain.EthernetOAMOperation_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomain.EthernetOAMOperation_T result = new flowDomain.EthernetOAMOperation_T();
		result.command=flowDomain.EthernetOAMCommandType_THelper.read(in);
		result.srcPoint=flowDomain.EthernetOAMParamer_THelper.read(in);
		result.snkPoint=flowDomain.EthernetOAMParamer_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomain.EthernetOAMOperation_T s)
	{
		flowDomain.EthernetOAMCommandType_THelper.write(out,s.command);
		flowDomain.EthernetOAMParamer_THelper.write(out,s.srcPoint);
		flowDomain.EthernetOAMParamer_THelper.write(out,s.snkPoint);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
