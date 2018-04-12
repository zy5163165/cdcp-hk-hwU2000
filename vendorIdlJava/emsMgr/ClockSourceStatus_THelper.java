package emsMgr;


/**
 *	Generated from IDL definition of struct "ClockSourceStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockSourceStatus_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(emsMgr.ClockSourceStatus_THelper.id(),"ClockSourceStatus_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("status", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("timingMode", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("quality", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("workingMode", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.ClockSourceStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.ClockSourceStatus_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/ClockSourceStatus_T:1.0";
	}
	public static emsMgr.ClockSourceStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		emsMgr.ClockSourceStatus_T result = new emsMgr.ClockSourceStatus_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.nativeEMSName=in.read_string();
		result.status=in.read_string();
		result.timingMode=in.read_string();
		result.quality=in.read_string();
		result.workingMode=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final emsMgr.ClockSourceStatus_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.nativeEMSName);
		out.write_string(s.status);
		out.write_string(s.timingMode);
		out.write_string(s.quality);
		out.write_string(s.workingMode);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
