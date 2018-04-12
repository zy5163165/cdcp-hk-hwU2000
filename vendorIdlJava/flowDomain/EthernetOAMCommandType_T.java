package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMCommandType_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMCommandType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EOCT_CC = 0;
	public static final EthernetOAMCommandType_T EOCT_CC = new EthernetOAMCommandType_T(_EOCT_CC);
	public static final int _EOCT_LB = 1;
	public static final EthernetOAMCommandType_T EOCT_LB = new EthernetOAMCommandType_T(_EOCT_LB);
	public static final int _EOCT_LT = 2;
	public static final EthernetOAMCommandType_T EOCT_LT = new EthernetOAMCommandType_T(_EOCT_LT);
	public int value()
	{
		return value;
	}
	public static EthernetOAMCommandType_T from_int(int value)
	{
		switch (value) {
			case _EOCT_CC: return EOCT_CC;
			case _EOCT_LB: return EOCT_LB;
			case _EOCT_LT: return EOCT_LT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EthernetOAMCommandType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
