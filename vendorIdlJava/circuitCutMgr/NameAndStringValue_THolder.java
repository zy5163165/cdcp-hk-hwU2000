package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "NameAndStringValue_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndStringValue_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.NameAndStringValue_T value;

	public NameAndStringValue_THolder ()
	{
	}
	public NameAndStringValue_THolder(final circuitCutMgr.NameAndStringValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.NameAndStringValue_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.NameAndStringValue_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.NameAndStringValue_THelper.write(_out, value);
	}
}
