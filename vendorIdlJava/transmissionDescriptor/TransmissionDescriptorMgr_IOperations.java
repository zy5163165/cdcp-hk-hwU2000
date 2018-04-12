package transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TransmissionDescriptorMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTransmissionDescriptors(int how_many, transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws globaldefs.ProcessingFailureException;
	void getAllTransmissionDescriptorNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTransmissionDescriptor(globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws globaldefs.ProcessingFailureException;
	void getAssociatedTPs(globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void createTransmissionDescriptor(transmissionDescriptor.TMDCreateData_T newTMDCreateData, transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws globaldefs.ProcessingFailureException;
	void deleteTransmissionDescriptor(globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws globaldefs.ProcessingFailureException;
	void modifyTransmissionDescriptor(globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TMDModifyData_T tmdModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, globaldefs.NamingAttributesList_THolder failedMEList, globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void validateTMDAssignmentToObject(globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalTPInfo) throws globaldefs.ProcessingFailureException;
	void setTMDAssociation(globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws globaldefs.ProcessingFailureException;
}
