package HW_vpnManager;

/**
 *	Generated from IDL interface "TrafficTrunkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class TrafficTrunkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrafficTrunkIterator_I value;
	public TrafficTrunkIterator_IHolder()
	{
	}
	public TrafficTrunkIterator_IHolder (final TrafficTrunkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TrafficTrunkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficTrunkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrafficTrunkIterator_IHelper.write (_out,value);
	}
}
