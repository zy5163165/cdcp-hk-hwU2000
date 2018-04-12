package protection;

/**
 *	Generated from IDL interface "WDMProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class WDMProtectionGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public WDMProtectionGroupIterator_I value;
	public WDMProtectionGroupIterator_IHolder()
	{
	}
	public WDMProtectionGroupIterator_IHolder (final WDMProtectionGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return WDMProtectionGroupIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WDMProtectionGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		WDMProtectionGroupIterator_IHelper.write (_out,value);
	}
}
