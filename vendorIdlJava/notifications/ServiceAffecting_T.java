package notifications;
/**
 *	Generated from IDL definition of enum "ServiceAffecting_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceAffecting_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SA_UNKNOWN = 0;
	public static final ServiceAffecting_T SA_UNKNOWN = new ServiceAffecting_T(_SA_UNKNOWN);
	public static final int _SA_SERVICE_AFFECTING = 1;
	public static final ServiceAffecting_T SA_SERVICE_AFFECTING = new ServiceAffecting_T(_SA_SERVICE_AFFECTING);
	public static final int _SA_NON_SERVICE_AFFECTING = 2;
	public static final ServiceAffecting_T SA_NON_SERVICE_AFFECTING = new ServiceAffecting_T(_SA_NON_SERVICE_AFFECTING);
	public int value()
	{
		return value;
	}
	public static ServiceAffecting_T from_int(int value)
	{
		switch (value) {
			case _SA_UNKNOWN: return SA_UNKNOWN;
			case _SA_SERVICE_AFFECTING: return SA_SERVICE_AFFECTING;
			case _SA_NON_SERVICE_AFFECTING: return SA_NON_SERVICE_AFFECTING;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ServiceAffecting_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
