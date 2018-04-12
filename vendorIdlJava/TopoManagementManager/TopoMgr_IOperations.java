package TopoManagementManager;

/**
 *	Generated from IDL interface "TopoMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TopoMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getTopoSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException;
	void getProtectSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException;
	void getClockSourceSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException;
	void getAllClockSourceViewlTopologicalLinks(int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;
}
