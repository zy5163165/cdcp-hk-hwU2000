package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "TtpDirection"
 *	@author JacORB IDL compiler 
 */

public final class TtpDirection
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _AEND = 0;
	public static final TtpDirection AEND = new TtpDirection(_AEND);
	public static final int _ZEND = 1;
	public static final TtpDirection ZEND = new TtpDirection(_ZEND);
	public static final int _BI = 2;
	public static final TtpDirection BI = new TtpDirection(_BI);
	public int value()
	{
		return value;
	}
	public static TtpDirection from_int(int value)
	{
		switch (value) {
			case _AEND: return AEND;
			case _ZEND: return ZEND;
			case _BI: return BI;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TtpDirection(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
