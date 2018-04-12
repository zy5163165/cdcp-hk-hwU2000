package performance;


/**
 *	Generated from IDL definition of struct "CollectTaskInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class CollectTaskInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(performance.CollectTaskInfo_THelper.id(),"CollectTaskInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("m_TaskName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_listPMTPSelect", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("m_Period", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_StartTime", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_EndTime", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_UserEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_FTPName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_FTPPassWord", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_FTPAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUpload", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.CollectTaskInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.CollectTaskInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/CollectTaskInfo_T:1.0";
	}
	public static performance.CollectTaskInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.CollectTaskInfo_T result = new performance.CollectTaskInfo_T();
		result.m_TaskName=in.read_string();
		result.m_listPMTPSelect = globaldefs.NamingAttributesList_THelper.read(in);
		result.m_Period=in.read_string();
		result.m_StartTime=in.read_string();
		result.m_EndTime=in.read_string();
		result.m_UserEMSName=in.read_string();
		result.m_FTPName=in.read_string();
		result.m_FTPPassWord=in.read_string();
		result.m_FTPAddress=in.read_string();
		result.forceUpload=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.CollectTaskInfo_T s)
	{
		out.write_string(s.m_TaskName);
		globaldefs.NamingAttributesList_THelper.write(out,s.m_listPMTPSelect);
		out.write_string(s.m_Period);
		out.write_string(s.m_StartTime);
		out.write_string(s.m_EndTime);
		out.write_string(s.m_UserEMSName);
		out.write_string(s.m_FTPName);
		out.write_string(s.m_FTPPassWord);
		out.write_string(s.m_FTPAddress);
		out.write_boolean(s.forceUpload);
	}
}
