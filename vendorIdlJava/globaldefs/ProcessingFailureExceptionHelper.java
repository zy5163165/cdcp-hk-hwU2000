package globaldefs;


/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureExceptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(globaldefs.ProcessingFailureExceptionHelper.id(),"ProcessingFailureException",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("exceptionType", globaldefs.ExceptionType_THelper.type(), null),new org.omg.CORBA.StructMember("errorReason", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final globaldefs.ProcessingFailureException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static globaldefs.ProcessingFailureException extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0";
	}
	public static globaldefs.ProcessingFailureException read (final org.omg.CORBA.portable.InputStream in)
	{
		globaldefs.ProcessingFailureException result = new globaldefs.ProcessingFailureException();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.exceptionType=globaldefs.ExceptionType_THelper.read(in);
		result.errorReason=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final globaldefs.ProcessingFailureException s)
	{
		out.write_string(id());
		globaldefs.ExceptionType_THelper.write(out,s.exceptionType);
		out.write_string(s.errorReason);
	}
}
