package guiCutThrough;


/**
 *	Generated from IDL definition of struct "GCTProfileInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class GCTProfileInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(guiCutThrough.GCTProfileInfo_THelper.id(),"GCTProfileInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serverLaunchCapability", guiCutThrough.ServerLaunchCapability_THelper.type(), null),new org.omg.CORBA.StructMember("gctHostname", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("emsGctPlatform", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("guiCutThroughDataList", guiCutThrough.GuiCutThroughDataList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final guiCutThrough.GCTProfileInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static guiCutThrough.GCTProfileInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/guiCutThrough/GCTProfileInfo_T:1.0";
	}
	public static guiCutThrough.GCTProfileInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		guiCutThrough.GCTProfileInfo_T result = new guiCutThrough.GCTProfileInfo_T();
		result.serverLaunchCapability=guiCutThrough.ServerLaunchCapability_THelper.read(in);
		result.gctHostname=in.read_string();
		result.emsGctPlatform=in.read_string();
		result.guiCutThroughDataList = guiCutThrough.GuiCutThroughDataList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final guiCutThrough.GCTProfileInfo_T s)
	{
		guiCutThrough.ServerLaunchCapability_THelper.write(out,s.serverLaunchCapability);
		out.write_string(s.gctHostname);
		out.write_string(s.emsGctPlatform);
		guiCutThrough.GuiCutThroughDataList_THelper.write(out,s.guiCutThroughDataList);
	}
}
