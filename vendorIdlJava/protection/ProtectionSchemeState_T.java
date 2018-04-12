package protection;
/**
 *	Generated from IDL definition of enum "ProtectionSchemeState_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSchemeState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PSS_UNKNOWN = 0;
	public static final ProtectionSchemeState_T PSS_UNKNOWN = new ProtectionSchemeState_T(_PSS_UNKNOWN);
	public static final int _PSS_AUTOMATIC = 1;
	public static final ProtectionSchemeState_T PSS_AUTOMATIC = new ProtectionSchemeState_T(_PSS_AUTOMATIC);
	public static final int _PSS_FORCED_OR_LOCKED_OUT = 2;
	public static final ProtectionSchemeState_T PSS_FORCED_OR_LOCKED_OUT = new ProtectionSchemeState_T(_PSS_FORCED_OR_LOCKED_OUT);
	public int value()
	{
		return value;
	}
	public static ProtectionSchemeState_T from_int(int value)
	{
		switch (value) {
			case _PSS_UNKNOWN: return PSS_UNKNOWN;
			case _PSS_AUTOMATIC: return PSS_AUTOMATIC;
			case _PSS_FORCED_OR_LOCKED_OUT: return PSS_FORCED_OR_LOCKED_OUT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProtectionSchemeState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
