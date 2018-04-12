package trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public trailNtwProtection.TrailNtwProtModifyData_T value;

	public TrailNtwProtModifyData_THolder ()
	{
	}
	public TrailNtwProtModifyData_THolder(final trailNtwProtection.TrailNtwProtModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return trailNtwProtection.TrailNtwProtModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = trailNtwProtection.TrailNtwProtModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		trailNtwProtection.TrailNtwProtModifyData_THelper.write(_out, value);
	}
}
