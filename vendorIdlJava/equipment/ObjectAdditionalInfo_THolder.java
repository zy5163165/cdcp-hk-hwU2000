package equipment;

/**
 *	Generated from IDL definition of struct "ObjectAdditionalInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAdditionalInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.ObjectAdditionalInfo_T value;

	public ObjectAdditionalInfo_THolder ()
	{
	}
	public ObjectAdditionalInfo_THolder(final equipment.ObjectAdditionalInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return equipment.ObjectAdditionalInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = equipment.ObjectAdditionalInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		equipment.ObjectAdditionalInfo_THelper.write(_out, value);
	}
}
