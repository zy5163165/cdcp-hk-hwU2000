package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMPointType_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPointType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EOT_MEP = 0;
	public static final EthernetOAMPointType_T EOT_MEP = new EthernetOAMPointType_T(_EOT_MEP);
	public static final int _EOP_MIP = 1;
	public static final EthernetOAMPointType_T EOP_MIP = new EthernetOAMPointType_T(_EOP_MIP);
	public int value()
	{
		return value;
	}
	public static EthernetOAMPointType_T from_int(int value)
	{
		switch (value) {
			case _EOT_MEP: return EOT_MEP;
			case _EOP_MIP: return EOP_MIP;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EthernetOAMPointType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
