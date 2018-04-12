package trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class TrafficDescriptorMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrafficDescriptorMgr_I value;
	public TrafficDescriptorMgr_IHolder()
	{
	}
	public TrafficDescriptorMgr_IHolder (final TrafficDescriptorMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TrafficDescriptorMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficDescriptorMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrafficDescriptorMgr_IHelper.write (_out,value);
	}
}
