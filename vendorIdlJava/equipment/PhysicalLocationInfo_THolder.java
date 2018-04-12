package equipment;
/**
 *	Generated from IDL definition of union "PhysicalLocationInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class PhysicalLocationInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public PhysicalLocationInfo_T value;

	public PhysicalLocationInfo_THolder ()
	{
	}
	public PhysicalLocationInfo_THolder (final PhysicalLocationInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PhysicalLocationInfo_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PhysicalLocationInfo_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PhysicalLocationInfo_THelper.write (out, value);
	}
}
