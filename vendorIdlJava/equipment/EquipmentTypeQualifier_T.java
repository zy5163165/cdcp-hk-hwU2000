package equipment;
/**
 *	Generated from IDL definition of enum "EquipmentTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentTypeQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EQT = 0;
	public static final EquipmentTypeQualifier_T EQT = new EquipmentTypeQualifier_T(_EQT);
	public static final int _EQT_HOLDER = 1;
	public static final EquipmentTypeQualifier_T EQT_HOLDER = new EquipmentTypeQualifier_T(_EQT_HOLDER);
	public int value()
	{
		return value;
	}
	public static EquipmentTypeQualifier_T from_int(int value)
	{
		switch (value) {
			case _EQT: return EQT;
			case _EQT_HOLDER: return EQT_HOLDER;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EquipmentTypeQualifier_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
