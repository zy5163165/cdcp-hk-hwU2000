package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "ErrorReason_T"
 *	@author JacORB IDL compiler 
 */

public final class ErrorReason_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.ErrorReason_THelper.id(),"ErrorReason_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("strObjName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("errorReason", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("strOperDesc", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.ErrorReason_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.ErrorReason_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ErrorReason_T:1.0";
	}
	public static circuitCutMgr.ErrorReason_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.ErrorReason_T result = new circuitCutMgr.ErrorReason_T();
		result.strObjName=in.read_string();
		result.errorReason=in.read_ulong();
		result.strOperDesc=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.ErrorReason_T s)
	{
		out.write_string(s.strObjName);
		out.write_ulong(s.errorReason);
		out.write_string(s.strOperDesc);
	}
}
