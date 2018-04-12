package protection;


/**
 *	Generated from IDL definition of struct "HW_XPICGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_XPICGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(protection.HW_XPICGroup_THelper.id(),"HW_XPICGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vLinkID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vTPName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("hLinkID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("hTPName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final protection.HW_XPICGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static protection.HW_XPICGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/HW_XPICGroup_T:1.0";
	}
	public static protection.HW_XPICGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		protection.HW_XPICGroup_T result = new protection.HW_XPICGroup_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.vLinkID=in.read_string();
		result.vTPName = globaldefs.NVSList_THelper.read(in);
		result.hLinkID=in.read_string();
		result.hTPName = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final protection.HW_XPICGroup_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.vLinkID);
		globaldefs.NVSList_THelper.write(out,s.vTPName);
		out.write_string(s.hLinkID);
		globaldefs.NVSList_THelper.write(out,s.hTPName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
