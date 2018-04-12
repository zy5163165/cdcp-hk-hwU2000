package managedElement;


/**
 *	Generated from IDL definition of struct "ManagedElement_T"
 *	@author JacORB IDL compiler 
 */

public final class ManagedElement_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElement.ManagedElement_THelper.id(),"ManagedElement_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("location", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("productName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("communicationState", managedElement.CommunicationState_THelper.type(), null),new org.omg.CORBA.StructMember("emsInSyncState", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("supportedRates", transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.ManagedElement_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.ManagedElement_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/ManagedElement_T:1.0";
	}
	public static managedElement.ManagedElement_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElement.ManagedElement_T result = new managedElement.ManagedElement_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.location=in.read_string();
		result.version=in.read_string();
		result.productName=in.read_string();
		result.communicationState=managedElement.CommunicationState_THelper.read(in);
		result.emsInSyncState=in.read_boolean();
		result.supportedRates = transmissionParameters.LayerRateList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElement.ManagedElement_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.location);
		out.write_string(s.version);
		out.write_string(s.productName);
		managedElement.CommunicationState_THelper.write(out,s.communicationState);
		out.write_boolean(s.emsInSyncState);
		transmissionParameters.LayerRateList_THelper.write(out,s.supportedRates);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
