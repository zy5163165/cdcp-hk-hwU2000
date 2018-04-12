package performance;

/**
 *	Generated from IDL definition of alias "PMMeasurementList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMMeasurementList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMMeasurement_T[] value;

	public PMMeasurementList_THolder ()
	{
	}
	public PMMeasurementList_THolder (final performance.PMMeasurement_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMMeasurementList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMMeasurementList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMMeasurementList_THelper.write (out,value);
	}
}
