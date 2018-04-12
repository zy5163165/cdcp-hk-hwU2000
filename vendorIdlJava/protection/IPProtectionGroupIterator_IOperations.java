package protection;

/**
 *	Generated from IDL interface "IPProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface IPProtectionGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, protection.IPProtectionGroupList_THolder pgpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
