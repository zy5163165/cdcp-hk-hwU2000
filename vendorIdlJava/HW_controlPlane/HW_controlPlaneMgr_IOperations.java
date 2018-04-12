package HW_controlPlane;

/**
 *	Generated from IDL interface "HW_controlPlaneMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_controlPlaneMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllRoutingAreaNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	void getAllRoutingNodeNames(globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, globaldefs.NamingAttributesList_THolder nodeNameList, globaldefs.NamingAttributesIterator_IHolder nodeIt) throws globaldefs.ProcessingFailureException;
	void getAllSnppLinks(globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, HW_controlPlane.HW_SnppLinkList_THolder snppLinkList, HW_controlPlane.HW_SnppLinkIterator_IHolder snppLinkIt) throws globaldefs.ProcessingFailureException;
	void getAllSnppNames(globaldefs.NameAndStringValue_T[] routingNodeName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllContainedSnpNames(globaldefs.NameAndStringValue_T[] snppName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void setSRLG(int srlgID, boolean addOrRemove, globaldefs.NamingAttributesList_THolder snppLinkNameList) throws globaldefs.ProcessingFailureException;
	void getNodeIDByMEName(globaldefs.NameAndStringValue_T[] meOrHolderName, HW_controlPlane.HW_controlPlaneMgr_IPackage.nodeIDList_THolder nodeID) throws globaldefs.ProcessingFailureException;
	void getMENameByNodeID(java.lang.String nodeID, globaldefs.NamingAttributesList_THolder meOrHolderNameList) throws globaldefs.ProcessingFailureException;
}
