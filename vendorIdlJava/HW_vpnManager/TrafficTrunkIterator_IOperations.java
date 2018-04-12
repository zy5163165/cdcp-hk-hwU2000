package HW_vpnManager;

/**
 *	Generated from IDL interface "TrafficTrunkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TrafficTrunkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
