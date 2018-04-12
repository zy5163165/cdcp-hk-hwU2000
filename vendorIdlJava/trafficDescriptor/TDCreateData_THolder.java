package trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trafficDescriptor.TDCreateData_T value;

	public TDCreateData_THolder ()
	{
	}
	public TDCreateData_THolder(final trafficDescriptor.TDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trafficDescriptor.TDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trafficDescriptor.TDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trafficDescriptor.TDCreateData_THelper.write(_out, value);
	}
}
