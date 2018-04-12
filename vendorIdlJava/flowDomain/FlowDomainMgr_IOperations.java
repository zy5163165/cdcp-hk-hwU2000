package flowDomain;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface FlowDomainMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllFlowDomains(int how_many, flowDomain.FDList_THolder flowDomains, flowDomain.FDIterator_IHolder fdIt) throws globaldefs.ProcessingFailureException;
	void getAllFlowDomainNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getFlowDomainsByUserLabel(java.lang.String userLabel, flowDomain.FDList_THolder flowDomains) throws globaldefs.ProcessingFailureException;
	void getFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException;
	void getFDfromMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException;
	void getTransmissionParams(globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, transmissionParameters.LayeredParameterList_THolder transmissionParams) throws globaldefs.ProcessingFailureException;
	void createFlowDomain(flowDomain.FDCreateData_T createData, globaldefs.NamingAttributesList_THolder fdEdgeCPTPs, flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteFlowDomain(globaldefs.NameAndStringValue_T[] fdName) throws globaldefs.ProcessingFailureException;
	void modifyFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FDModifyData_T fdModifyData, flowDomain.FlowDomain_THolder newFD) throws globaldefs.ProcessingFailureException;
	void associateMFDsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames) throws globaldefs.ProcessingFailureException;
	void deAssociateMFDsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames) throws globaldefs.ProcessingFailureException;
	void associateCPTPsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException;
	void deAssociateCPTPsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException;
	void getAllMFDs(globaldefs.NameAndStringValue_T[] holderName, int how_many, flowDomain.MFDList_THolder mfds, flowDomain.MFDIterator_IHolder mfdIt) throws globaldefs.ProcessingFailureException;
	void getAllMFDNames(globaldefs.NameAndStringValue_T[] holderName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException;
	void getAssigningMFD(globaldefs.NameAndStringValue_T[] cptpName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException;
	void createMFD(flowDomain.MFDCreateData_T createData, flowDomain.MatrixFlowDomain_THolder theMFD) throws globaldefs.ProcessingFailureException;
	void deleteMFD(globaldefs.NameAndStringValue_T[] mfdName) throws globaldefs.ProcessingFailureException;
	void modifyMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MFDModifyData_T mfdModifyData, globaldefs.NameAndStringValue_T[] transmissionDescriptorName, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalModificationInfo, flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void assignCPTPsToMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException;
	void unassignCPTPsFromMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException;
	void createFTP(flowDomain.FTPCreateData_T createData, terminationPoint.TerminationPoint_THolder theFTP) throws globaldefs.ProcessingFailureException;
	void deleteFTP(globaldefs.NameAndStringValue_T[] ftpName) throws globaldefs.ProcessingFailureException;
	void getAllCPTPs(globaldefs.NameAndStringValue_T[] fdOrMfdName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAssignableCPTPs(globaldefs.NameAndStringValue_T[] mfdName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllFDFrs(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;
	void getAllFDFrNames(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getFDFrsWithTP(globaldefs.NameAndStringValue_T[] tpName, int how_many, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;
	void getFDFrsByUserLabel(java.lang.String userLabel, flowDomainFragment.FDFrList_THolder fdfrs) throws globaldefs.ProcessingFailureException;
	void getFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void createFDFr(flowDomainFragment.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, globaldefs.NamingAttributesList_THolder endTPs, globaldefs.NamingAttributesList_THolder internalTPs, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void activateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void deactivateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void deleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName, subnetworkConnection.TPDataList_THolder tpsToModify) throws globaldefs.ProcessingFailureException;
	void modifyFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FDFrModifyData_T fdfrModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.GradesOfImpact_T tolerableImpact, flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void addFPsToFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomain.ConnectivityRequirement_T connectivityRequirement, globaldefs.NamingAttributesList_THolder tpNames, globaldefs.NamingAttributesList_THolder internalTpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void removeFPsFromFDFr(globaldefs.NameAndStringValue_T[] fdfrName, globaldefs.NamingAttributesList_THolder tpNames, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void validateTMDAssignmentToMFD(globaldefs.NameAndStringValue_T[] mfdName, org.omg.CORBA.StringHolder tmdAssignmentState, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalTPInfo) throws globaldefs.ProcessingFailureException;
	void getFDFrServerTrail(globaldefs.NameAndStringValue_T[] fdfrName, globaldefs.NamingAttributesList_THolder serverNameList) throws globaldefs.ProcessingFailureException;
	void getAllEthernetOAMPoint(globaldefs.NameAndStringValue_T[] Fdfrname, flowDomain.EthernetOAMPointList_THolder oamPointList) throws globaldefs.ProcessingFailureException;
	void performEthernetOAMCommand(flowDomain.EthernetOAMOperation_T operation, flowDomain.EthernetLTTestResultList_THolder ltTestResult) throws globaldefs.ProcessingFailureException;
}
