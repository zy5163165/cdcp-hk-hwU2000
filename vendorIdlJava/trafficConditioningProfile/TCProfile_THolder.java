package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TCProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.TCProfile_T value;

	public TCProfile_THolder ()
	{
	}
	public TCProfile_THolder(final trafficConditioningProfile.TCProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficConditioningProfile.TCProfile_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficConditioningProfile.TCProfile_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficConditioningProfile.TCProfile_THelper.write(_out, value);
	}
}
