package HW_controlPlane;

/**
 *	Generated from IDL interface "HW_SnppLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_SnppLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, HW_controlPlane.HW_SnppLinkList_THolder snppLinkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
