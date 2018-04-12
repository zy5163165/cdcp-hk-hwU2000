package notifications;
/**
 *	Generated from IDL definition of enum "ObjectType_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ObjectType_T value;

	public ObjectType_THolder ()
	{
	}
	public ObjectType_THolder (final ObjectType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectType_THelper.write (out,value);
	}
}
