package HW_mstpService;
/**
 *	Generated from IDL definition of enum "HW_AtmServiceType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_AST_NA = 0;
	public static final HW_AtmServiceType_T HW_AST_NA = new HW_AtmServiceType_T(_HW_AST_NA);
	public static final int _HW_AST_PVP = 1;
	public static final HW_AtmServiceType_T HW_AST_PVP = new HW_AtmServiceType_T(_HW_AST_PVP);
	public static final int _HW_AST_PVC = 2;
	public static final HW_AtmServiceType_T HW_AST_PVC = new HW_AtmServiceType_T(_HW_AST_PVC);
	public int value()
	{
		return value;
	}
	public static HW_AtmServiceType_T from_int(int value)
	{
		switch (value) {
			case _HW_AST_NA: return HW_AST_NA;
			case _HW_AST_PVP: return HW_AST_PVP;
			case _HW_AST_PVC: return HW_AST_PVC;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmServiceType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
