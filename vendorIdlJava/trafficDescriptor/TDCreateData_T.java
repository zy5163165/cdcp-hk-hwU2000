package trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TDCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public trafficDescriptor.ServiceCategory_T serviceCategory;
	public globaldefs.NameAndStringValue_T[] trafficParameters;
	public java.lang.String conformanceDefinition = "";
	public boolean activeState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TDCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, trafficDescriptor.ServiceCategory_T serviceCategory, globaldefs.NameAndStringValue_T[] trafficParameters, java.lang.String conformanceDefinition, boolean activeState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.serviceCategory = serviceCategory;
		this.trafficParameters = trafficParameters;
		this.conformanceDefinition = conformanceDefinition;
		this.activeState = activeState;
		this.additionalInfo = additionalInfo;
	}
}
