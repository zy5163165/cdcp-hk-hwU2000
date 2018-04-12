package equipment;
/**
 *	Generated from IDL definition of enum "ResourceTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class ResourceTypeQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EQTROOM = 0;
	public static final ResourceTypeQualifier_T EQTROOM = new ResourceTypeQualifier_T(_EQTROOM);
	public static final int _CABINET = 1;
	public static final ResourceTypeQualifier_T CABINET = new ResourceTypeQualifier_T(_CABINET);
	public static final int _SHELF = 2;
	public static final ResourceTypeQualifier_T SHELF = new ResourceTypeQualifier_T(_SHELF);
	public int value()
	{
		return value;
	}
	public static ResourceTypeQualifier_T from_int(int value)
	{
		switch (value) {
			case _EQTROOM: return EQTROOM;
			case _CABINET: return CABINET;
			case _SHELF: return SHELF;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ResourceTypeQualifier_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
