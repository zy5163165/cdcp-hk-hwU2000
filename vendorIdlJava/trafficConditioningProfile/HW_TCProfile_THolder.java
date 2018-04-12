package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TCProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TCProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.HW_TCProfile_T value;

	public HW_TCProfile_THolder ()
	{
	}
	public HW_TCProfile_THolder(final trafficConditioningProfile.HW_TCProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficConditioningProfile.HW_TCProfile_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficConditioningProfile.HW_TCProfile_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficConditioningProfile.HW_TCProfile_THelper.write(_out, value);
	}
}
