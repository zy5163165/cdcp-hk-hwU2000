package protection;
/**
 *	Generated from IDL definition of enum "ProtectionType_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PT_MSP_APS = 0;
	public static final ProtectionType_T PT_MSP_APS = new ProtectionType_T(_PT_MSP_APS);
	public static final int _PT_SNCP = 1;
	public static final ProtectionType_T PT_SNCP = new ProtectionType_T(_PT_SNCP);
	public int value()
	{
		return value;
	}
	public static ProtectionType_T from_int(int value)
	{
		switch (value) {
			case _PT_MSP_APS: return PT_MSP_APS;
			case _PT_SNCP: return PT_SNCP;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProtectionType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
