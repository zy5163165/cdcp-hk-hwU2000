package HW_mstpService;
/**
 *	Generated from IDL definition of enum "HW_EthServiceType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_EST_NA = 0;
	public static final HW_EthServiceType_T HW_EST_NA = new HW_EthServiceType_T(_HW_EST_NA);
	public static final int _HW_EST_EPL = 1;
	public static final HW_EthServiceType_T HW_EST_EPL = new HW_EthServiceType_T(_HW_EST_EPL);
	public static final int _HW_EST_EVPL = 2;
	public static final HW_EthServiceType_T HW_EST_EVPL = new HW_EthServiceType_T(_HW_EST_EVPL);
	public static final int _HW_EST_EPLAN = 3;
	public static final HW_EthServiceType_T HW_EST_EPLAN = new HW_EthServiceType_T(_HW_EST_EPLAN);
	public static final int _HW_EST_EVPLAN = 4;
	public static final HW_EthServiceType_T HW_EST_EVPLAN = new HW_EthServiceType_T(_HW_EST_EVPLAN);
	public int value()
	{
		return value;
	}
	public static HW_EthServiceType_T from_int(int value)
	{
		switch (value) {
			case _HW_EST_NA: return HW_EST_NA;
			case _HW_EST_EPL: return HW_EST_EPL;
			case _HW_EST_EVPL: return HW_EST_EVPL;
			case _HW_EST_EPLAN: return HW_EST_EPLAN;
			case _HW_EST_EVPLAN: return HW_EST_EVPLAN;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_EthServiceType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
