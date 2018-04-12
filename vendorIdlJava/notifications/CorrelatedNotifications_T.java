package notifications;

/**
 *	Generated from IDL definition of struct "CorrelatedNotifications_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotifications_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CorrelatedNotifications_T(){}
	public globaldefs.NameAndStringValue_T[] source;
	public java.lang.String[] notifIDs;
	public CorrelatedNotifications_T(globaldefs.NameAndStringValue_T[] source, java.lang.String[] notifIDs)
	{
		this.source = source;
		this.notifIDs = notifIDs;
	}
}
