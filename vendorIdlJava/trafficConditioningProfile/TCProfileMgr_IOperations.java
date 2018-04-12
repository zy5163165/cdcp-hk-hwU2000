package trafficConditioningProfile;

/**
 *	Generated from IDL interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TCProfileMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTCProfiles(int how_many, trafficConditioningProfile.TCProfileList_THolder tcProfileList, trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws globaldefs.ProcessingFailureException;
	void getTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfile_THolder tcProfile) throws globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedTPs(globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void createTCProfile(trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, trafficConditioningProfile.TCProfile_THolder newTCProfile) throws globaldefs.ProcessingFailureException;
	void deleteTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName) throws globaldefs.ProcessingFailureException;
	void modifyTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void HW_getAllTCProfileNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void HW_getTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.HW_TCProfile_THolder tcProfile) throws globaldefs.ProcessingFailureException;
	void HW_getAllTCProfiles(int how_many, trafficConditioningProfile.HW_TCProfileList_THolder tcProfileList, trafficConditioningProfile.HW_TCProfileIterator_IHolder tcProfileIt) throws globaldefs.ProcessingFailureException;
	void HW_createTCProfile(trafficConditioningProfile.HW_TCProfileCreateData_T newTCProfileCreateData, trafficConditioningProfile.HW_TCProfile_THolder newTCProfile) throws globaldefs.ProcessingFailureException;
	void HW_modifyTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.HW_TCProfileCreateData_T tcProfileModifyData, trafficConditioningProfile.HW_TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void assignTrafficConditioningProfile(trafficConditioningProfile.TrafficConditioningProfileAssign_T[] resourceList, trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder failedResourceList) throws globaldefs.ProcessingFailureException;
	void deassignTrafficConditioningProfile(trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] resourceList, trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder failedResourceList) throws globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedResouces(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder resourceList) throws globaldefs.ProcessingFailureException;
}
