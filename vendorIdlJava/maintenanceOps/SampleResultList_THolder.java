package maintenanceOps;

/**
 *	Generated from IDL definition of alias "SampleResultList_T"
 *	@author JacORB IDL compiler 
 */

public final class SampleResultList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public maintenanceOps.SampleResult_T[] value;

	public SampleResultList_THolder ()
	{
	}
	public SampleResultList_THolder (final maintenanceOps.SampleResult_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SampleResultList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SampleResultList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SampleResultList_THelper.write (out,value);
	}
}
