package trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TrafficDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptor_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficDescriptor_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public trafficDescriptor.ServiceCategory_T serviceCategory;
	public globaldefs.NameAndStringValue_T[] trafficParameters;
	public java.lang.String conformanceDefinition = "";
	public boolean activeState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficDescriptor_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, trafficDescriptor.ServiceCategory_T serviceCategory, globaldefs.NameAndStringValue_T[] trafficParameters, java.lang.String conformanceDefinition, boolean activeState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.serviceCategory = serviceCategory;
		this.trafficParameters = trafficParameters;
		this.conformanceDefinition = conformanceDefinition;
		this.activeState = activeState;
		this.additionalInfo = additionalInfo;
	}
}
