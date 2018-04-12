package protection;

/**
 *	Generated from IDL interface "WDMProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface WDMProtectionGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, protection.WDMProtectionGroupList_THolder pgpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
