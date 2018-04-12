package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TCProfileCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfileCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.TCProfileCreateData_T value;

	public TCProfileCreateData_THolder ()
	{
	}
	public TCProfileCreateData_THolder(final trafficConditioningProfile.TCProfileCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficConditioningProfile.TCProfileCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficConditioningProfile.TCProfileCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficConditioningProfile.TCProfileCreateData_THelper.write(_out, value);
	}
}
