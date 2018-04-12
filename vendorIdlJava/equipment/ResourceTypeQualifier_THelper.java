package equipment;
/**
 *	Generated from IDL definition of enum "ResourceTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class ResourceTypeQualifier_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(equipment.ResourceTypeQualifier_THelper.id(),"ResourceTypeQualifier_T",new String[]{"EQTROOM","CABINET","SHELF"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.ResourceTypeQualifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.ResourceTypeQualifier_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/ResourceTypeQualifier_T:1.0";
	}
	public static ResourceTypeQualifier_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ResourceTypeQualifier_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ResourceTypeQualifier_T s)
	{
		out.write_long(s.value());
	}
}
