package performance;

/**
 *	Generated from IDL interface "PMStateIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface PMStateIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.PMStateList_THolder pmStateList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
