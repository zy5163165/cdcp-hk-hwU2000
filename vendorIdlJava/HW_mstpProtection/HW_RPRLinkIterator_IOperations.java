package HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_RPRLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_RPRLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, HW_mstpProtection.HW_RPRLinkInfoList_THolder rprLinkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
