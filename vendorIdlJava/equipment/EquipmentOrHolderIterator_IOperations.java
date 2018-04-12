package equipment;

/**
 *	Generated from IDL interface "EquipmentOrHolderIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface EquipmentOrHolderIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
