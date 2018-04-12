package subnetworkConnection;
/**
 *	Generated from IDL definition of enum "GradesOfImpact_T"
 *	@author JacORB IDL compiler 
 */

public final class GradesOfImpact_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public GradesOfImpact_T value;

	public GradesOfImpact_THolder ()
	{
	}
	public GradesOfImpact_THolder (final GradesOfImpact_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GradesOfImpact_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GradesOfImpact_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GradesOfImpact_THelper.write (out,value);
	}
}
