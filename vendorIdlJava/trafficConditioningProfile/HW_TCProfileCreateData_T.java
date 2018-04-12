package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TCProfileCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TCProfileCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_TCProfileCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String type = "";
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_TCProfileCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String type, java.lang.String owner, transmissionParameters.LayeredParameters_T[] transmissionParams, trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.type = type;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.classifierList = classifierList;
		this.additionalInfo = additionalInfo;
	}
}
