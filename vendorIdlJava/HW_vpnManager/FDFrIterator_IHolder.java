package HW_vpnManager;

/**
 *	Generated from IDL interface "FDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class FDFrIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FDFrIterator_I value;
	public FDFrIterator_IHolder()
	{
	}
	public FDFrIterator_IHolder (final FDFrIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FDFrIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDFrIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FDFrIterator_IHelper.write (_out,value);
	}
}
