package encapsulationLayerLink;
/**
 *	Generated from IDL definition of enum "BandwidthProvisioningMode_T"
 *	@author JacORB IDL compiler 
 */

public final class BandwidthProvisioningMode_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public BandwidthProvisioningMode_T value;

	public BandwidthProvisioningMode_THolder ()
	{
	}
	public BandwidthProvisioningMode_THolder (final BandwidthProvisioningMode_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BandwidthProvisioningMode_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BandwidthProvisioningMode_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BandwidthProvisioningMode_THelper.write (out,value);
	}
}
