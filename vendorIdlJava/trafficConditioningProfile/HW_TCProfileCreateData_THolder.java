package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TCProfileCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TCProfileCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.HW_TCProfileCreateData_T value;

	public HW_TCProfileCreateData_THolder ()
	{
	}
	public HW_TCProfileCreateData_THolder(final trafficConditioningProfile.HW_TCProfileCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficConditioningProfile.HW_TCProfileCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficConditioningProfile.HW_TCProfileCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficConditioningProfile.HW_TCProfileCreateData_THelper.write(_out, value);
	}
}
