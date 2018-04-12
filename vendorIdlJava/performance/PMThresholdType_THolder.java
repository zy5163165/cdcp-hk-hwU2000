package performance;
/**
 *	Generated from IDL definition of enum "PMThresholdType_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public PMThresholdType_T value;

	public PMThresholdType_THolder ()
	{
	}
	public PMThresholdType_THolder (final PMThresholdType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMThresholdType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMThresholdType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMThresholdType_THelper.write (out,value);
	}
}
