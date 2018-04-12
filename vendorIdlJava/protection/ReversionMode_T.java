package protection;
/**
 *	Generated from IDL definition of enum "ReversionMode_T"
 *	@author JacORB IDL compiler 
 */

public final class ReversionMode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _RM_UNKNOWN = 0;
	public static final ReversionMode_T RM_UNKNOWN = new ReversionMode_T(_RM_UNKNOWN);
	public static final int _RM_NON_REVERTIVE = 1;
	public static final ReversionMode_T RM_NON_REVERTIVE = new ReversionMode_T(_RM_NON_REVERTIVE);
	public static final int _RM_REVERTIVE = 2;
	public static final ReversionMode_T RM_REVERTIVE = new ReversionMode_T(_RM_REVERTIVE);
	public int value()
	{
		return value;
	}
	public static ReversionMode_T from_int(int value)
	{
		switch (value) {
			case _RM_UNKNOWN: return RM_UNKNOWN;
			case _RM_NON_REVERTIVE: return RM_NON_REVERTIVE;
			case _RM_REVERTIVE: return RM_REVERTIVE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ReversionMode_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
