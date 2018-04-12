package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_SwitchPosition_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SwitchPosition_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_SP_NA = 0;
	public static final HW_SwitchPosition_T HW_SP_NA = new HW_SwitchPosition_T(_HW_SP_NA);
	public static final int _HW_SP_EAST = 1;
	public static final HW_SwitchPosition_T HW_SP_EAST = new HW_SwitchPosition_T(_HW_SP_EAST);
	public static final int _HW_SP_WEST = 2;
	public static final HW_SwitchPosition_T HW_SP_WEST = new HW_SwitchPosition_T(_HW_SP_WEST);
	public int value()
	{
		return value;
	}
	public static HW_SwitchPosition_T from_int(int value)
	{
		switch (value) {
			case _HW_SP_NA: return HW_SP_NA;
			case _HW_SP_EAST: return HW_SP_EAST;
			case _HW_SP_WEST: return HW_SP_WEST;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_SwitchPosition_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
