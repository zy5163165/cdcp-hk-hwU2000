package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmPGSwitchAction_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSwitchAction_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_ASAT_NA = 0;
	public static final HW_AtmPGSwitchAction_T HW_ASAT_NA = new HW_AtmPGSwitchAction_T(_HW_ASAT_NA);
	public static final int _HW_ASAT_SWITCH = 1;
	public static final HW_AtmPGSwitchAction_T HW_ASAT_SWITCH = new HW_AtmPGSwitchAction_T(_HW_ASAT_SWITCH);
	public static final int _HW_ASAT_RESTORE = 2;
	public static final HW_AtmPGSwitchAction_T HW_ASAT_RESTORE = new HW_AtmPGSwitchAction_T(_HW_ASAT_RESTORE);
	public int value()
	{
		return value;
	}
	public static HW_AtmPGSwitchAction_T from_int(int value)
	{
		switch (value) {
			case _HW_ASAT_NA: return HW_ASAT_NA;
			case _HW_ASAT_SWITCH: return HW_ASAT_SWITCH;
			case _HW_ASAT_RESTORE: return HW_ASAT_RESTORE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmPGSwitchAction_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
