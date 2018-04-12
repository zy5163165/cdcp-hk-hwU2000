package encapsulationLayerLink;

/**
 *	Generated from IDL interface "ELLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ELLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, encapsulationLayerLink.ELLinkList_THolder ellList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
