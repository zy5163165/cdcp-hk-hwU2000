package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmPGSwitchType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSwitchType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_AST_NA = 0;
	public static final HW_AtmPGSwitchType_T HW_AST_NA = new HW_AtmPGSwitchType_T(_HW_AST_NA);
	public static final int _HW_AST_SINGLE_END = 1;
	public static final HW_AtmPGSwitchType_T HW_AST_SINGLE_END = new HW_AtmPGSwitchType_T(_HW_AST_SINGLE_END);
	public static final int _HW_AST_BI_END = 2;
	public static final HW_AtmPGSwitchType_T HW_AST_BI_END = new HW_AtmPGSwitchType_T(_HW_AST_BI_END);
	public int value()
	{
		return value;
	}
	public static HW_AtmPGSwitchType_T from_int(int value)
	{
		switch (value) {
			case _HW_AST_NA: return HW_AST_NA;
			case _HW_AST_SINGLE_END: return HW_AST_SINGLE_END;
			case _HW_AST_BI_END: return HW_AST_BI_END;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmPGSwitchType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
