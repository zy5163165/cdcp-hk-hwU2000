package HW_mstpService;

/**
 *	Generated from IDL interface "HW_EthServiceIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_EthServiceIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, HW_mstpService.HW_EthServiceList_THolder serviceList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
