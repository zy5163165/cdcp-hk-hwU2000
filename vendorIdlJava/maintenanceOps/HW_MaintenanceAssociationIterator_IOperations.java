package maintenanceOps;

/**
 *	Generated from IDL interface "HW_MaintenanceAssociationIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_MaintenanceAssociationIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, maintenanceOps.HW_MaintenanceAssociationList_THolder maList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
