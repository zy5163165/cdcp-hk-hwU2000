package circuitCutMgr;
/**
 *	Generated from IDL definition of enum "SNCRate_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCRate_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _RATE_VC4_4C = 0;
	public static final SNCRate_T RATE_VC4_4C = new SNCRate_T(_RATE_VC4_4C);
	public static final int _RATE_VC4_8C = 1;
	public static final SNCRate_T RATE_VC4_8C = new SNCRate_T(_RATE_VC4_8C);
	public static final int _RATE_VC4_16C = 2;
	public static final SNCRate_T RATE_VC4_16C = new SNCRate_T(_RATE_VC4_16C);
	public static final int _RATE_VC4_64C = 3;
	public static final SNCRate_T RATE_VC4_64C = new SNCRate_T(_RATE_VC4_64C);
	public static final int _RATE_SERVERVC4 = 4;
	public static final SNCRate_T RATE_SERVERVC4 = new SNCRate_T(_RATE_SERVERVC4);
	public static final int _RATE_MS = 5;
	public static final SNCRate_T RATE_MS = new SNCRate_T(_RATE_MS);
	public static final int _RATE_VC12 = 6;
	public static final SNCRate_T RATE_VC12 = new SNCRate_T(_RATE_VC12);
	public static final int _RATE_VC3 = 7;
	public static final SNCRate_T RATE_VC3 = new SNCRate_T(_RATE_VC3);
	public static final int _RATE_VC4 = 8;
	public static final SNCRate_T RATE_VC4 = new SNCRate_T(_RATE_VC4);
	public int value()
	{
		return value;
	}
	public static SNCRate_T from_int(int value)
	{
		switch (value) {
			case _RATE_VC4_4C: return RATE_VC4_4C;
			case _RATE_VC4_8C: return RATE_VC4_8C;
			case _RATE_VC4_16C: return RATE_VC4_16C;
			case _RATE_VC4_64C: return RATE_VC4_64C;
			case _RATE_SERVERVC4: return RATE_SERVERVC4;
			case _RATE_MS: return RATE_MS;
			case _RATE_VC12: return RATE_VC12;
			case _RATE_VC3: return RATE_VC3;
			case _RATE_VC4: return RATE_VC4;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SNCRate_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
