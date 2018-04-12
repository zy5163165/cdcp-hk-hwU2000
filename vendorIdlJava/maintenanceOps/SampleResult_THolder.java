package maintenanceOps;

/**
 *	Generated from IDL definition of struct "SampleResult_T"
 *	@author JacORB IDL compiler 
 */

public final class SampleResult_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.SampleResult_T value;

	public SampleResult_THolder ()
	{
	}
	public SampleResult_THolder(final maintenanceOps.SampleResult_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return maintenanceOps.SampleResult_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = maintenanceOps.SampleResult_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		maintenanceOps.SampleResult_THelper.write(_out, value);
	}
}
