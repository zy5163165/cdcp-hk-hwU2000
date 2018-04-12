package flowDomain;

/**
 *	Generated from IDL definition of alias "FDList_T"
 *	@author JacORB IDL compiler 
 */

public final class FDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.FlowDomain_T[] value;

	public FDList_THolder ()
	{
	}
	public FDList_THolder (final flowDomain.FlowDomain_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDList_THelper.write (out,value);
	}
}
