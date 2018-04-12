package protection;


/**
 *	Generated from IDL definition of struct "ProtectionSubnetworkLink_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetworkLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.ProtectionSubnetworkLink_THelper.id(),"ProtectionSubnetworkLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("srcTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("snkTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("vc4List", protection.TSSeq_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.ProtectionSubnetworkLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.ProtectionSubnetworkLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetworkLink_T:1.0";
	}
	public static protection.ProtectionSubnetworkLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.ProtectionSubnetworkLink_T result = new protection.ProtectionSubnetworkLink_T();
		result.srcTP = globaldefs.NVSList_THelper.read(in);
		result.snkTP = globaldefs.NVSList_THelper.read(in);
		result.vc4List = protection.TSSeq_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.ProtectionSubnetworkLink_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.srcTP);
		globaldefs.NVSList_THelper.write(out,s.snkTP);
		protection.TSSeq_THelper.write(out,s.vc4List);
	}
}
