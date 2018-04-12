package encapsulationLayerLink;
/**
 *	Generated from IDL definition of enum "BandwidthProvisioningMode_T"
 *	@author JacORB IDL compiler 
 */

public final class BandwidthProvisioningMode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _BP_NONE = 0;
	public static final BandwidthProvisioningMode_T BP_NONE = new BandwidthProvisioningMode_T(_BP_NONE);
	public static final int _BP_AUTOMATIC = 1;
	public static final BandwidthProvisioningMode_T BP_AUTOMATIC = new BandwidthProvisioningMode_T(_BP_AUTOMATIC);
	public static final int _BP_MANUAL = 2;
	public static final BandwidthProvisioningMode_T BP_MANUAL = new BandwidthProvisioningMode_T(_BP_MANUAL);
	public static final int _BP_BY_CALL = 3;
	public static final BandwidthProvisioningMode_T BP_BY_CALL = new BandwidthProvisioningMode_T(_BP_BY_CALL);
	public int value()
	{
		return value;
	}
	public static BandwidthProvisioningMode_T from_int(int value)
	{
		switch (value) {
			case _BP_NONE: return BP_NONE;
			case _BP_AUTOMATIC: return BP_AUTOMATIC;
			case _BP_MANUAL: return BP_MANUAL;
			case _BP_BY_CALL: return BP_BY_CALL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected BandwidthProvisioningMode_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
