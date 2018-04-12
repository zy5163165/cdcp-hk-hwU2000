package maintenanceOps;

/**
 *	Generated from IDL interface "CurrentMaintenanceOperationIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface CurrentMaintenanceOperationIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder cMOList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
