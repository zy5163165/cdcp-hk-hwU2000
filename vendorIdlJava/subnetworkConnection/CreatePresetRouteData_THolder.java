package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CreatePresetRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreatePresetRouteData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.CreatePresetRouteData_T value;

	public CreatePresetRouteData_THolder ()
	{
	}
	public CreatePresetRouteData_THolder(final subnetworkConnection.CreatePresetRouteData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.CreatePresetRouteData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.CreatePresetRouteData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.CreatePresetRouteData_THelper.write(_out, value);
	}
}
