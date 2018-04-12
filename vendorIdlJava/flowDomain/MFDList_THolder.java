package flowDomain;

/**
 *	Generated from IDL definition of alias "MFDList_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.MatrixFlowDomain_T[] value;

	public MFDList_THolder ()
	{
	}
	public MFDList_THolder (final flowDomain.MatrixFlowDomain_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MFDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MFDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MFDList_THelper.write (out,value);
	}
}
