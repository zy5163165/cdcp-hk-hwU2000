package maintenanceOps;

/**
 *	Generated from IDL interface "HW_MaintenanceDomainIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_MaintenanceDomainIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, maintenanceOps.HW_MaintenanceDomainList_THolder mdList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
