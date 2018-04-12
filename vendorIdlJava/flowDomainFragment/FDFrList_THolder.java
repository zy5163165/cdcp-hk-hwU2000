package flowDomainFragment;

/**
 *	Generated from IDL definition of alias "FDFrList_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomainFragment.FlowDomainFragment_T[] value;

	public FDFrList_THolder ()
	{
	}
	public FDFrList_THolder (final flowDomainFragment.FlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDFrList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDFrList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDFrList_THelper.write (out,value);
	}
}
