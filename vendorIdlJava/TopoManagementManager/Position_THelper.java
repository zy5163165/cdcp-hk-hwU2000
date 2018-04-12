package TopoManagementManager;


/**
 *	Generated from IDL definition of struct "Position_T"
 *	@author JacORB IDL compiler 
 */

public final class Position_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(TopoManagementManager.Position_THelper.id(),"Position_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("xPos", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("yPos", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final TopoManagementManager.Position_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static TopoManagementManager.Position_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/TopoManagementManager/Position_T:1.0";
	}
	public static TopoManagementManager.Position_T read (final org.omg.CORBA.portable.InputStream in)
	{
		TopoManagementManager.Position_T result = new TopoManagementManager.Position_T();
		result.xPos=in.read_long();
		result.yPos=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final TopoManagementManager.Position_T s)
	{
		out.write_long(s.xPos);
		out.write_long(s.yPos);
	}
}
