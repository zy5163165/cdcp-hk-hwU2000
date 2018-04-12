package trailNtwProtection;

/**
 *	Generated from IDL interface "TrailNtwProtectionIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TrailNtwProtectionIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, trailNtwProtection.TrailNtwProtectionList_THolder tnpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
