package flowDomain;
/**
 *	Generated from IDL definition of enum "ConnectivityState_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _CS_UNKNOWN = 0;
	public static final ConnectivityState_T CS_UNKNOWN = new ConnectivityState_T(_CS_UNKNOWN);
	public static final int _CS_FULLY_CONNECTED = 1;
	public static final ConnectivityState_T CS_FULLY_CONNECTED = new ConnectivityState_T(_CS_FULLY_CONNECTED);
	public static final int _CS_NOT_FULLY_CONNECTED = 2;
	public static final ConnectivityState_T CS_NOT_FULLY_CONNECTED = new ConnectivityState_T(_CS_NOT_FULLY_CONNECTED);
	public int value()
	{
		return value;
	}
	public static ConnectivityState_T from_int(int value)
	{
		switch (value) {
			case _CS_UNKNOWN: return CS_UNKNOWN;
			case _CS_FULLY_CONNECTED: return CS_FULLY_CONNECTED;
			case _CS_NOT_FULLY_CONNECTED: return CS_NOT_FULLY_CONNECTED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ConnectivityState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
