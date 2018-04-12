package circuitCutMgr;

/**
 *	Generated from IDL interface "ConnectivityNodePairIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ConnectivityNodePairIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, circuitCutMgr.ConnectivityNodePairList_THolder meList) throws circuitCutMgr.ProcessingFailureException;
	int getLength() throws circuitCutMgr.ProcessingFailureException;
	void destroy() throws circuitCutMgr.ProcessingFailureException;
}
