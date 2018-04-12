package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmPGUseState_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGUseState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_AUS_NA = 0;
	public static final HW_AtmPGUseState_T HW_AUS_NA = new HW_AtmPGUseState_T(_HW_AUS_NA);
	public static final int _HW_AUS_USED = 1;
	public static final HW_AtmPGUseState_T HW_AUS_USED = new HW_AtmPGUseState_T(_HW_AUS_USED);
	public static final int _HW_AUS_UNUSED = 2;
	public static final HW_AtmPGUseState_T HW_AUS_UNUSED = new HW_AtmPGUseState_T(_HW_AUS_UNUSED);
	public int value()
	{
		return value;
	}
	public static HW_AtmPGUseState_T from_int(int value)
	{
		switch (value) {
			case _HW_AUS_NA: return HW_AUS_NA;
			case _HW_AUS_USED: return HW_AUS_USED;
			case _HW_AUS_UNUSED: return HW_AUS_UNUSED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmPGUseState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
