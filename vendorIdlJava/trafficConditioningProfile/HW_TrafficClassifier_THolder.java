package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TrafficClassifier_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TrafficClassifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.HW_TrafficClassifier_T value;

	public HW_TrafficClassifier_THolder ()
	{
	}
	public HW_TrafficClassifier_THolder(final trafficConditioningProfile.HW_TrafficClassifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficConditioningProfile.HW_TrafficClassifier_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficConditioningProfile.HW_TrafficClassifier_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficConditioningProfile.HW_TrafficClassifier_THelper.write(_out, value);
	}
}
