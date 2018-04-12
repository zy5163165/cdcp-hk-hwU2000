package flowDomainFragment;

/**
 *	Generated from IDL interface "FDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface FDFrIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomainFragment.FDFrList_THolder fdfrList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
