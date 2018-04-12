package trafficConditioningProfile;

/**
 *	Generated from IDL definition of alias "TrafficConditioningProfileDeassignList_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileDeassignList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] value;

	public TrafficConditioningProfileDeassignList_THolder ()
	{
	}
	public TrafficConditioningProfileDeassignList_THolder (final trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficConditioningProfileDeassignList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficConditioningProfileDeassignList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrafficConditioningProfileDeassignList_THelper.write (out,value);
	}
}
