package trailNtwProtection;

/**
 *	Generated from IDL interface "TrailNtwProtectionIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class TrailNtwProtectionIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrailNtwProtectionIterator_I value;
	public TrailNtwProtectionIterator_IHolder()
	{
	}
	public TrailNtwProtectionIterator_IHolder (final TrailNtwProtectionIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TrailNtwProtectionIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrailNtwProtectionIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrailNtwProtectionIterator_IHelper.write (_out,value);
	}
}
