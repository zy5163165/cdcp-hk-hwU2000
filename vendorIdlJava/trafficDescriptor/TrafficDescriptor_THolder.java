package trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TrafficDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptor_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficDescriptor.TrafficDescriptor_T value;

	public TrafficDescriptor_THolder ()
	{
	}
	public TrafficDescriptor_THolder(final trafficDescriptor.TrafficDescriptor_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficDescriptor.TrafficDescriptor_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficDescriptor.TrafficDescriptor_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficDescriptor.TrafficDescriptor_THelper.write(_out, value);
	}
}
