package equipment;

/**
 *	Generated from IDL definition of alias "PhysicalLocationInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class PhysicalLocationInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.PhysicalLocationInfo_T[] value;

	public PhysicalLocationInfoList_THolder ()
	{
	}
	public PhysicalLocationInfoList_THolder (final equipment.PhysicalLocationInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PhysicalLocationInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PhysicalLocationInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PhysicalLocationInfoList_THelper.write (out,value);
	}
}
