package trafficConditioningProfile;

/**
 *	Generated from IDL definition of alias "HW_TCProfileList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TCProfileList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficConditioningProfile.HW_TCProfile_T[] value;

	public HW_TCProfileList_THolder ()
	{
	}
	public HW_TCProfileList_THolder (final trafficConditioningProfile.HW_TCProfile_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_TCProfileList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_TCProfileList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_TCProfileList_THelper.write (out,value);
	}
}
