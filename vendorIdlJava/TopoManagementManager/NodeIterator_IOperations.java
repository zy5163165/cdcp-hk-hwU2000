package TopoManagementManager;

/**
 *	Generated from IDL interface "NodeIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface NodeIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, TopoManagementManager.NodeList_THolder nodeList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
