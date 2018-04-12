package encapsulationLayerLink;

/**
 *	Generated from IDL interface "EncapsulationLayerLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface EncapsulationLayerLinkMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllELLinks(int how_many, encapsulationLayerLink.ELLinkList_THolder ells, encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws globaldefs.ProcessingFailureException;
	void getAllELLinkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getELLinkWithTP(globaldefs.NameAndStringValue_T[] tpName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException;
	void getConnectingELL(globaldefs.NameAndStringValue_T[] tpName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException;
	void getELLinkWithSncOrTl(globaldefs.NameAndStringValue_T[] sncOrTlName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException;
	void getAllELLinksWithMeOrFd(globaldefs.NameAndStringValue_T[] meOrFdName, int how_many, encapsulationLayerLink.ELLinkList_THolder ells, encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws globaldefs.ProcessingFailureException;
	void getELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException;
	void getServerSNCsAndTLs(globaldefs.NameAndStringValue_T[] ellName, subnetworkConnection.SubnetworkConnectionList_THolder sncList, topologicalLink.TopologicalLinkList_THolder tlList) throws globaldefs.ProcessingFailureException;
	void getTransmissionParams(globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, transmissionParameters.LayeredParameterList_THolder transmissionParams) throws globaldefs.ProcessingFailureException;
	void createELLink(encapsulationLayerLink.ELLinkCreateData_T createData, encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void activateELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deactivateELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteELLink(globaldefs.NameAndStringValue_T[] ellName) throws globaldefs.ProcessingFailureException;
	void modifyELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.ELLinkModifyData_T ellModifyData, encapsulationLayerLink.EncapsulationLayerLink_THolder newELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void increaseBandwidthOfELLink(globaldefs.NameAndStringValue_T[] ellName, boolean automatic, subnetworkConnection.SNCCreateData_T[] additionalSNCs, short numberOfSNCs, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalModificationInfo, encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws globaldefs.ProcessingFailureException;
	void decreaseBandwidthOfELLink(globaldefs.NameAndStringValue_T[] ellName, globaldefs.NameAndStringValue_T[][] sncNames, short numberOfSNCs, globaldefs.NameAndStringValue_T[] additionalModificationInfo, encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws globaldefs.ProcessingFailureException;
	void setELLinkLCASState(globaldefs.NameAndStringValue_T[] ellName, boolean enableState) throws globaldefs.ProcessingFailureException;
}
