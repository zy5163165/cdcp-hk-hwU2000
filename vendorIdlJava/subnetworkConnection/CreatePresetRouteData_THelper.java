package subnetworkConnection;


/**
 *	Generated from IDL definition of struct "CreatePresetRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreatePresetRouteData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(subnetworkConnection.CreatePresetRouteData_THelper.id(),"CreatePresetRouteData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sncName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("presetRouteID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("priority", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("neTpInclusions", subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpSncExclusions", subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.CreatePresetRouteData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.CreatePresetRouteData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/CreatePresetRouteData_T:1.0";
	}
	public static subnetworkConnection.CreatePresetRouteData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		subnetworkConnection.CreatePresetRouteData_T result = new subnetworkConnection.CreatePresetRouteData_T();
		result.sncName = globaldefs.NVSList_THelper.read(in);
		result.presetRouteID=in.read_ulong();
		result.priority=in.read_ulong();
		result.neTpInclusions = subnetworkConnection.ResourceList_THelper.read(in);
		result.neTpSncExclusions = subnetworkConnection.ResourceList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final subnetworkConnection.CreatePresetRouteData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.sncName);
		out.write_ulong(s.presetRouteID);
		out.write_ulong(s.priority);
		subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
