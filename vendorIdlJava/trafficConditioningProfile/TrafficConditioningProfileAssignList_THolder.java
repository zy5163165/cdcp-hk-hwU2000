package trafficConditioningProfile;

/**
 *	Generated from IDL definition of alias "TrafficConditioningProfileAssignList_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileAssignList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.TrafficConditioningProfileAssign_T[] value;

	public TrafficConditioningProfileAssignList_THolder ()
	{
	}
	public TrafficConditioningProfileAssignList_THolder (final trafficConditioningProfile.TrafficConditioningProfileAssign_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficConditioningProfileAssignList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficConditioningProfileAssignList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrafficConditioningProfileAssignList_THelper.write (out,value);
	}
}
