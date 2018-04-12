package nmsSession;

/**
 *	Generated from IDL interface "NmsSession_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface NmsSession_IOperations
	extends session.Session_IOperations
{
	/* constants */
	/* operations  */
	void eventLossOccurred(java.lang.String startTime, java.lang.String notificationId);
	void eventLossCleared(java.lang.String endTime);
}
