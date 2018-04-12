package HW_mstpService;
/**
 *	Generated from IDL definition of enum "HW_AtmProtectRole_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmProtectRole_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_APR_NA = 0;
	public static final HW_AtmProtectRole_T HW_APR_NA = new HW_AtmProtectRole_T(_HW_APR_NA);
	public static final int _HW_APR_WORKING = 1;
	public static final HW_AtmProtectRole_T HW_APR_WORKING = new HW_AtmProtectRole_T(_HW_APR_WORKING);
	public static final int _HW_APR_PROTECTING = 2;
	public static final HW_AtmProtectRole_T HW_APR_PROTECTING = new HW_AtmProtectRole_T(_HW_APR_PROTECTING);
	public int value()
	{
		return value;
	}
	public static HW_AtmProtectRole_T from_int(int value)
	{
		switch (value) {
			case _HW_APR_NA: return HW_APR_NA;
			case _HW_APR_WORKING: return HW_APR_WORKING;
			case _HW_APR_PROTECTING: return HW_APR_PROTECTING;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmProtectRole_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
