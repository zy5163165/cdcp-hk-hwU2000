package terminationPoint;

/**
 *	Generated from IDL interface "TerminationPointIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TerminationPointIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
