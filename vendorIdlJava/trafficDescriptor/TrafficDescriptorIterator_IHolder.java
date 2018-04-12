package trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class TrafficDescriptorIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrafficDescriptorIterator_I value;
	public TrafficDescriptorIterator_IHolder()
	{
	}
	public TrafficDescriptorIterator_IHolder (final TrafficDescriptorIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TrafficDescriptorIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficDescriptorIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrafficDescriptorIterator_IHelper.write (_out,value);
	}
}
