package transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TransmissionDescriptorIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
