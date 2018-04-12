package encapsulationLayerLink;


/**
 *	Generated from IDL definition of struct "ELLinkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(encapsulationLayerLink.ELLinkCreateData_THelper.id(),"ELLinkCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("type", encapsulationLayerLink.LinkType_THelper.type(), null),new org.omg.CORBA.StructMember("endTPs", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("segment", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("provisioningMode", encapsulationLayerLink.BandwidthProvisioningMode_THelper.type(), null),new org.omg.CORBA.StructMember("sncList", subnetworkConnection.SNCCreateDataList_THelper.type(), null),new org.omg.CORBA.StructMember("callName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final encapsulationLayerLink.ELLinkCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static encapsulationLayerLink.ELLinkCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/encapsulationLayerLink/ELLinkCreateData_T:1.0";
	}
	public static encapsulationLayerLink.ELLinkCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		encapsulationLayerLink.ELLinkCreateData_T result = new encapsulationLayerLink.ELLinkCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.rate=in.read_short();
		result.type=encapsulationLayerLink.LinkType_THelper.read(in);
		result.endTPs = globaldefs.NamingAttributesList_THelper.read(in);
		result.segment=in.read_boolean();
		result.provisioningMode=encapsulationLayerLink.BandwidthProvisioningMode_THelper.read(in);
		result.sncList = subnetworkConnection.SNCCreateDataList_THelper.read(in);
		result.callName = globaldefs.NVSList_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final encapsulationLayerLink.ELLinkCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		out.write_short(s.rate);
		encapsulationLayerLink.LinkType_THelper.write(out,s.type);
		globaldefs.NamingAttributesList_THelper.write(out,s.endTPs);
		out.write_boolean(s.segment);
		encapsulationLayerLink.BandwidthProvisioningMode_THelper.write(out,s.provisioningMode);
		subnetworkConnection.SNCCreateDataList_THelper.write(out,s.sncList);
		globaldefs.NVSList_THelper.write(out,s.callName);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
