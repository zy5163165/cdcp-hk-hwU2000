package HW_mstpService;
/**
 *	Generated from IDL definition of enum "HW_AtmServiceSpreadType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceSpreadType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HW_ASST_NA = 0;
	public static final HW_AtmServiceSpreadType_T HW_ASST_NA = new HW_AtmServiceSpreadType_T(_HW_ASST_NA);
	public static final int _HW_ASST_P2P = 1;
	public static final HW_AtmServiceSpreadType_T HW_ASST_P2P = new HW_AtmServiceSpreadType_T(_HW_ASST_P2P);
	public static final int _HW_ASST_P2MPROOT = 2;
	public static final HW_AtmServiceSpreadType_T HW_ASST_P2MPROOT = new HW_AtmServiceSpreadType_T(_HW_ASST_P2MPROOT);
	public static final int _HW_ASST_P2MPLEAF = 3;
	public static final HW_AtmServiceSpreadType_T HW_ASST_P2MPLEAF = new HW_AtmServiceSpreadType_T(_HW_ASST_P2MPLEAF);
	public int value()
	{
		return value;
	}
	public static HW_AtmServiceSpreadType_T from_int(int value)
	{
		switch (value) {
			case _HW_ASST_NA: return HW_ASST_NA;
			case _HW_ASST_P2P: return HW_ASST_P2P;
			case _HW_ASST_P2MPROOT: return HW_ASST_P2MPROOT;
			case _HW_ASST_P2MPLEAF: return HW_ASST_P2MPLEAF;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmServiceSpreadType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
