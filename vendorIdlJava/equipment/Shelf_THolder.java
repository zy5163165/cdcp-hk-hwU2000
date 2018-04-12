package equipment;

/**
 *	Generated from IDL definition of struct "Shelf_T"
 *	@author JacORB IDL compiler 
 */

public final class Shelf_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.Shelf_T value;

	public Shelf_THolder ()
	{
	}
	public Shelf_THolder(final equipment.Shelf_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return equipment.Shelf_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = equipment.Shelf_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		equipment.Shelf_THelper.write(_out, value);
	}
}
