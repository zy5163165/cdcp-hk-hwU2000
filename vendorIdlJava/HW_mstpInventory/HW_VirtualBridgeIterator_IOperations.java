package HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_VirtualBridgeIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_VirtualBridgeIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, HW_mstpInventory.HW_VirtualBridgeList_THolder vbList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
