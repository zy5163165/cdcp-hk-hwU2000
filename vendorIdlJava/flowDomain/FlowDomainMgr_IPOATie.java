package flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class FlowDomainMgr_IPOATie
	extends FlowDomainMgr_IPOA
{
	private FlowDomainMgr_IOperations _delegate;

	private POA _poa;
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public flowDomain.FlowDomainMgr_I _this()
	{
		return flowDomain.FlowDomainMgr_IHelper.narrow(_this_object());
	}
	public flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return flowDomain.FlowDomainMgr_IHelper.narrow(_this_object(orb));
	}
	public FlowDomainMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void deleteMFD(globaldefs.NameAndStringValue_T[] mfdName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteMFD(mfdName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAssignableCPTPs(globaldefs.NameAndStringValue_T[] mfdName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssignableCPTPs(mfdName,how_many,tpList,tpIt);
	}

	public void getAllMFDs(globaldefs.NameAndStringValue_T[] holderName, int how_many, flowDomain.MFDList_THolder mfds, flowDomain.MFDIterator_IHolder mfdIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDs(holderName,how_many,mfds,mfdIt);
	}

	public void getAllFlowDomainNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomainNames(how_many,nameList,nameIt);
	}

	public void validateTMDAssignmentToMFD(globaldefs.NameAndStringValue_T[] mfdName, org.omg.CORBA.StringHolder tmdAssignmentState, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalTPInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.validateTMDAssignmentToMFD(mfdName,tmdAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void getAllFDFrNames(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrNames(fdName,how_many,connectivityRateList,nameList,nameIt);
	}

	public void createMFD(flowDomain.MFDCreateData_T createData, flowDomain.MatrixFlowDomain_THolder theMFD) throws globaldefs.ProcessingFailureException
	{
_delegate.createMFD(createData,theMFD);
	}

	public void deleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName, subnetworkConnection.TPDataList_THolder tpsToModify) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName,tpsToModify);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void removeFPsFromFDFr(globaldefs.NameAndStringValue_T[] fdfrName, globaldefs.NamingAttributesList_THolder tpNames, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.removeFPsFromFDFr(fdfrName,tpNames,errorReason);
	}

	public void getAssigningMFD(globaldefs.NameAndStringValue_T[] cptpName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssigningMFD(cptpName,mfd);
	}

	public void getAllFlowDomains(int how_many, flowDomain.FDList_THolder flowDomains, flowDomain.FDIterator_IHolder fdIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomains(how_many,flowDomains,fdIt);
	}

	public void getAllCPTPs(globaldefs.NameAndStringValue_T[] fdOrMfdName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCPTPs(fdOrMfdName,how_many,tpList,tpIt);
	}

	public void getFDfromMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDfromMFD(mfdName,flowDomain);
	}

	public void createFTP(flowDomain.FTPCreateData_T createData, terminationPoint.TerminationPoint_THolder theFTP) throws globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,theFTP);
	}

	public void getAllFDFrs(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void getFDFrsWithTP(globaldefs.NameAndStringValue_T[] tpName, int how_many, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(tpName,how_many,fdfrList,fdfrIt);
	}

	public void createFlowDomain(flowDomain.FDCreateData_T createData, globaldefs.NamingAttributesList_THolder fdEdgeCPTPs, flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createFlowDomain(createData,fdEdgeCPTPs,theFD,errorReason);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void modifyFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FDFrModifyData_T fdfrModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.GradesOfImpact_T tolerableImpact, flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
	}

	public void getFDFrServerTrail(globaldefs.NameAndStringValue_T[] fdfrName, globaldefs.NamingAttributesList_THolder serverNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrServerTrail(fdfrName,serverNameList);
	}

	public void getMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException
	{
_delegate.getMFD(mfdName,mfd);
	}

	public void assignCPTPsToMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException
	{
_delegate.assignCPTPsToMFD(mfdName,tpNames);
	}

	public void modifyMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MFDModifyData_T mfdModifyData, globaldefs.NameAndStringValue_T[] transmissionDescriptorName, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalModificationInfo, flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyMFD(mfdName,mfdModifyData,transmissionDescriptorName,transmissionParams,additionalModificationInfo,newMFD,errorReason);
	}

	public void getAllMFDNames(globaldefs.NameAndStringValue_T[] holderName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDNames(holderName,how_many,nameList,nameIt);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, flowDomainFragment.FDFrList_THolder fdfrs) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrs);
	}

	public void performEthernetOAMCommand(flowDomain.EthernetOAMOperation_T operation, flowDomain.EthernetLTTestResultList_THolder ltTestResult) throws globaldefs.ProcessingFailureException
	{
_delegate.performEthernetOAMCommand(operation,ltTestResult);
	}

	public void getTransmissionParams(globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, transmissionParameters.LayeredParameterList_THolder transmissionParams) throws globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void associateMFDsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames) throws globaldefs.ProcessingFailureException
	{
_delegate.associateMFDsWithFlowDomain(fdName,mfdNames);
	}

	public void deAssociateMFDsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames) throws globaldefs.ProcessingFailureException
	{
_delegate.deAssociateMFDsFromFlowDomain(fdName,mfdNames);
	}

	public void getFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

	public void createFDFr(flowDomainFragment.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, globaldefs.NamingAttributesList_THolder endTPs, globaldefs.NamingAttributesList_THolder internalTPs, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void addFPsToFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomain.ConnectivityRequirement_T connectivityRequirement, globaldefs.NamingAttributesList_THolder tpNames, globaldefs.NamingAttributesList_THolder internalTpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.addFPsToFDFr(fdfrName,connectivityRequirement,tpNames,internalTpNames,tpsToModify,errorReason);
	}

	public void deactivateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void associateCPTPsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException
	{
_delegate.associateCPTPsWithFlowDomain(fdName,tpNames);
	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, flowDomain.FDList_THolder flowDomains) throws globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomainsByUserLabel(userLabel,flowDomains);
	}

	public void activateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void deleteFTP(globaldefs.NameAndStringValue_T[] ftpName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName);
	}

	public void deleteFlowDomain(globaldefs.NameAndStringValue_T[] fdName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFlowDomain(fdName);
	}

	public void unassignCPTPsFromMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException
	{
_delegate.unassignCPTPsFromMFD(mfdName,tpNames);
	}

	public void deAssociateCPTPsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] tpNames) throws globaldefs.ProcessingFailureException
	{
_delegate.deAssociateCPTPsFromFlowDomain(fdName,tpNames);
	}

	public void modifyFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FDModifyData_T fdModifyData, flowDomain.FlowDomain_THolder newFD) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyFlowDomain(fdName,fdModifyData,newFD);
	}

	public void getAllEthernetOAMPoint(globaldefs.NameAndStringValue_T[] Fdfrname, flowDomain.EthernetOAMPointList_THolder oamPointList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEthernetOAMPoint(Fdfrname,oamPointList);
	}

	public void getFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomain(fdName,flowDomain);
	}

}
