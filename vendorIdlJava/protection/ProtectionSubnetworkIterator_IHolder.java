package protection;

/**
 *	Generated from IDL interface "ProtectionSubnetworkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ProtectionSubnetworkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProtectionSubnetworkIterator_I value;
	public ProtectionSubnetworkIterator_IHolder()
	{
	}
	public ProtectionSubnetworkIterator_IHolder (final ProtectionSubnetworkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProtectionSubnetworkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionSubnetworkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProtectionSubnetworkIterator_IHelper.write (_out,value);
	}
}
