package managedElement;

/**
 *	Generated from IDL definition of alias "ManagedElementList_T"
 *	@author JacORB IDL compiler 
 */

public final class ManagedElementList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public managedElement.ManagedElement_T[] value;

	public ManagedElementList_THolder ()
	{
	}
	public ManagedElementList_THolder (final managedElement.ManagedElement_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ManagedElementList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ManagedElementList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ManagedElementList_THelper.write (out,value);
	}
}
