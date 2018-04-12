package guiCutThrough;


/**
 *	Generated from IDL definition of struct "GuiCutThroughData_T"
 *	@author JacORB IDL compiler 
 */

public final class GuiCutThroughData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(guiCutThrough.GuiCutThroughData_THelper.id(),"GuiCutThroughData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("gctScope", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("gctContext", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("gctCommand", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final guiCutThrough.GuiCutThroughData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static guiCutThrough.GuiCutThroughData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/guiCutThrough/GuiCutThroughData_T:1.0";
	}
	public static guiCutThrough.GuiCutThroughData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		guiCutThrough.GuiCutThroughData_T result = new guiCutThrough.GuiCutThroughData_T();
		result.gctScope=in.read_string();
		result.gctContext=in.read_string();
		result.gctCommand=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final guiCutThrough.GuiCutThroughData_T s)
	{
		out.write_string(s.gctScope);
		out.write_string(s.gctContext);
		out.write_string(s.gctCommand);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
