package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TrafficConditioningProfileAssign_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileAssign_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.TrafficConditioningProfileAssign_T value;

	public TrafficConditioningProfileAssign_THolder ()
	{
	}
	public TrafficConditioningProfileAssign_THolder(final trafficConditioningProfile.TrafficConditioningProfileAssign_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficConditioningProfile.TrafficConditioningProfileAssign_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficConditioningProfile.TrafficConditioningProfileAssign_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficConditioningProfile.TrafficConditioningProfileAssign_THelper.write(_out, value);
	}
}
