package HW_securityMgr;

/**
 *	Generated from IDL interface "HW_securityMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_securityMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void modifyPassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword) throws globaldefs.ProcessingFailureException;
}
