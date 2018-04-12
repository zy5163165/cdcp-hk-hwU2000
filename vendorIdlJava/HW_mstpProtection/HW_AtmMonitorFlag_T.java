package HW_mstpProtection;
/**
 *	Generated from IDL definition of enum "HW_AtmMonitorFlag_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmMonitorFlag_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_AMF_NA = 0;
	public static final HW_AtmMonitorFlag_T HW_AMF_NA = new HW_AtmMonitorFlag_T(_HW_AMF_NA);
	public static final int _HW_AMF_CONNECTION = 1;
	public static final HW_AtmMonitorFlag_T HW_AMF_CONNECTION = new HW_AtmMonitorFlag_T(_HW_AMF_CONNECTION);
	public static final int _HW_AMF_PROTECT_PAIR = 2;
	public static final HW_AtmMonitorFlag_T HW_AMF_PROTECT_PAIR = new HW_AtmMonitorFlag_T(_HW_AMF_PROTECT_PAIR);
	public int value()
	{
		return value;
	}
	public static HW_AtmMonitorFlag_T from_int(int value)
	{
		switch (value) {
			case _HW_AMF_NA: return HW_AMF_NA;
			case _HW_AMF_CONNECTION: return HW_AMF_CONNECTION;
			case _HW_AMF_PROTECT_PAIR: return HW_AMF_PROTECT_PAIR;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmMonitorFlag_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
