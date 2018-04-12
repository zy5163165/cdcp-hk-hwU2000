package protection;
/**
 *	Generated from IDL definition of enum "ProtectionGroupType_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroupType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PGT_MSP_1_PLUS_1 = 0;
	public static final ProtectionGroupType_T PGT_MSP_1_PLUS_1 = new ProtectionGroupType_T(_PGT_MSP_1_PLUS_1);
	public static final int _PGT_MSP_1_FOR_N = 1;
	public static final ProtectionGroupType_T PGT_MSP_1_FOR_N = new ProtectionGroupType_T(_PGT_MSP_1_FOR_N);
	public static final int _PGT_2_FIBER_BLSR = 2;
	public static final ProtectionGroupType_T PGT_2_FIBER_BLSR = new ProtectionGroupType_T(_PGT_2_FIBER_BLSR);
	public static final int _PGT_4_FIBER_BLSR = 3;
	public static final ProtectionGroupType_T PGT_4_FIBER_BLSR = new ProtectionGroupType_T(_PGT_4_FIBER_BLSR);
	public int value()
	{
		return value;
	}
	public static ProtectionGroupType_T from_int(int value)
	{
		switch (value) {
			case _PGT_MSP_1_PLUS_1: return PGT_MSP_1_PLUS_1;
			case _PGT_MSP_1_FOR_N: return PGT_MSP_1_FOR_N;
			case _PGT_2_FIBER_BLSR: return PGT_2_FIBER_BLSR;
			case _PGT_4_FIBER_BLSR: return PGT_4_FIBER_BLSR;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProtectionGroupType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
