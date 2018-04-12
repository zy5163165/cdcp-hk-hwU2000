package emsSession;

/**
 *	Generated from IDL interface "EmsSession_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface EmsSession_IOperations
	extends session.Session_IOperations
{
	/* constants */
	/* operations  */
	void getSupportedManagers(emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws globaldefs.ProcessingFailureException;
	void getManager(java.lang.String managerName, common.Common_IHolder managerInterface) throws globaldefs.ProcessingFailureException;
	void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder eventChannel) throws globaldefs.ProcessingFailureException;
}
