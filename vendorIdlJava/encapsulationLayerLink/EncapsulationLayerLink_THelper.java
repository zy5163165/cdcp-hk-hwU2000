package encapsulationLayerLink;


/**
 *	Generated from IDL definition of struct "EncapsulationLayerLink_T"
 *	@author JacORB IDL compiler 
 */

public final class EncapsulationLayerLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(encapsulationLayerLink.EncapsulationLayerLink_THelper.id(),"EncapsulationLayerLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", encapsulationLayerLink.LinkType_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("endTPs", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("route", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("segment", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("routeGroups", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final encapsulationLayerLink.EncapsulationLayerLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static encapsulationLayerLink.EncapsulationLayerLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/encapsulationLayerLink/EncapsulationLayerLink_T:1.0";
	}
	public static encapsulationLayerLink.EncapsulationLayerLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		encapsulationLayerLink.EncapsulationLayerLink_T result = new encapsulationLayerLink.EncapsulationLayerLink_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.type=encapsulationLayerLink.LinkType_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.rate=in.read_short();
		result.networkAccessDomain=in.read_string();
		result.endTPs = globaldefs.NamingAttributesList_THelper.read(in);
		result.route = globaldefs.NamingAttributesList_THelper.read(in);
		result.segment=in.read_boolean();
		result.routeGroups = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final encapsulationLayerLink.EncapsulationLayerLink_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		encapsulationLayerLink.LinkType_THelper.write(out,s.type);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		out.write_short(s.rate);
		out.write_string(s.networkAccessDomain);
		globaldefs.NamingAttributesList_THelper.write(out,s.endTPs);
		globaldefs.NamingAttributesList_THelper.write(out,s.route);
		out.write_boolean(s.segment);
		globaldefs.NamingAttributesList_THelper.write(out,s.routeGroups);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
