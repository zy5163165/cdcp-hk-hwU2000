package flowDomainFragment;
/**
 *	Generated from IDL definition of enum "FDFrType_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FDFrType_T value;

	public FDFrType_THolder ()
	{
	}
	public FDFrType_THolder (final FDFrType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDFrType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDFrType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDFrType_THelper.write (out,value);
	}
}
