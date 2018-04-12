package encapsulationLayerLink;
/**
 *	Generated from IDL definition of enum "LinkType_T"
 *	@author JacORB IDL compiler 
 */

public final class LinkType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _LT_POINT_TO_POINT = 0;
	public static final LinkType_T LT_POINT_TO_POINT = new LinkType_T(_LT_POINT_TO_POINT);
	public static final int _LT_POINT_TO_MULTIPOINT = 1;
	public static final LinkType_T LT_POINT_TO_MULTIPOINT = new LinkType_T(_LT_POINT_TO_MULTIPOINT);
	public static final int _LT_MULTIPOINT = 2;
	public static final LinkType_T LT_MULTIPOINT = new LinkType_T(_LT_MULTIPOINT);
	public int value()
	{
		return value;
	}
	public static LinkType_T from_int(int value)
	{
		switch (value) {
			case _LT_POINT_TO_POINT: return LT_POINT_TO_POINT;
			case _LT_POINT_TO_MULTIPOINT: return LT_POINT_TO_MULTIPOINT;
			case _LT_MULTIPOINT: return LT_MULTIPOINT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected LinkType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
