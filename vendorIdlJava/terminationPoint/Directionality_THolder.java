package terminationPoint;
/**
 *	Generated from IDL definition of enum "Directionality_T"
 *	@author JacORB IDL compiler 
 */

public final class Directionality_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public Directionality_T value;

	public Directionality_THolder ()
	{
	}
	public Directionality_THolder (final Directionality_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Directionality_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Directionality_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		Directionality_THelper.write (out,value);
	}
}
