package flowDomain;
/**
 *	Generated from IDL definition of enum "ConnectivityRequirement_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityRequirement_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _CR_IGNORE = 0;
	public static final ConnectivityRequirement_T CR_IGNORE = new ConnectivityRequirement_T(_CR_IGNORE);
	public static final int _CR_REJECT = 1;
	public static final ConnectivityRequirement_T CR_REJECT = new ConnectivityRequirement_T(_CR_REJECT);
	public int value()
	{
		return value;
	}
	public static ConnectivityRequirement_T from_int(int value)
	{
		switch (value) {
			case _CR_IGNORE: return CR_IGNORE;
			case _CR_REJECT: return CR_REJECT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ConnectivityRequirement_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
