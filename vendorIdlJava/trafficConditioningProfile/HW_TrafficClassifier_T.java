package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TrafficClassifier_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TrafficClassifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_TrafficClassifier_T(){}
	public java.lang.String classifierID = "";
	public java.lang.String logicalRelationType = "";
	public java.lang.String action = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public HW_TrafficClassifier_T(java.lang.String classifierID, java.lang.String logicalRelationType, java.lang.String action, transmissionParameters.LayeredParameters_T[] transmissionParams)
	{
		this.classifierID = classifierID;
		this.logicalRelationType = logicalRelationType;
		this.action = action;
		this.transmissionParams = transmissionParams;
	}
}
