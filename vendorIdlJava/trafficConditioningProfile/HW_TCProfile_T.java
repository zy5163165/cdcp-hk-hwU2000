package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TCProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TCProfile_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_TCProfile_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_TCProfile_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.classifierList = classifierList;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
