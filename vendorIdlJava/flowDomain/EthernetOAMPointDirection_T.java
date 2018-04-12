package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMPointDirection_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPointDirection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EOPD_BI = 0;
	public static final EthernetOAMPointDirection_T EOPD_BI = new EthernetOAMPointDirection_T(_EOPD_BI);
	public static final int _EOPD_INGRESS = 1;
	public static final EthernetOAMPointDirection_T EOPD_INGRESS = new EthernetOAMPointDirection_T(_EOPD_INGRESS);
	public static final int _EOPD_EGRESS = 2;
	public static final EthernetOAMPointDirection_T EOPD_EGRESS = new EthernetOAMPointDirection_T(_EOPD_EGRESS);
	public int value()
	{
		return value;
	}
	public static EthernetOAMPointDirection_T from_int(int value)
	{
		switch (value) {
			case _EOPD_BI: return EOPD_BI;
			case _EOPD_INGRESS: return EOPD_INGRESS;
			case _EOPD_EGRESS: return EOPD_EGRESS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EthernetOAMPointDirection_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
