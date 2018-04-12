package globaldefs;

/**
 *	Generated from IDL definition of struct "NameAndStringValue_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndStringValue_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T value;

	public NameAndStringValue_THolder ()
	{
	}
	public NameAndStringValue_THolder(final globaldefs.NameAndStringValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return globaldefs.NameAndStringValue_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = globaldefs.NameAndStringValue_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		globaldefs.NameAndStringValue_THelper.write(_out, value);
	}
}
