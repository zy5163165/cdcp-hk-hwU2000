package maintenanceOps;
/**
 *	Generated from IDL definition of enum "MaintenanceOperationMode_T"
 *	@author JacORB IDL compiler 
 */

public final class MaintenanceOperationMode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _MOM_OPERATE = 0;
	public static final MaintenanceOperationMode_T MOM_OPERATE = new MaintenanceOperationMode_T(_MOM_OPERATE);
	public static final int _MOM_RELEASE = 1;
	public static final MaintenanceOperationMode_T MOM_RELEASE = new MaintenanceOperationMode_T(_MOM_RELEASE);
	public int value()
	{
		return value;
	}
	public static MaintenanceOperationMode_T from_int(int value)
	{
		switch (value) {
			case _MOM_OPERATE: return MOM_OPERATE;
			case _MOM_RELEASE: return MOM_RELEASE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected MaintenanceOperationMode_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
