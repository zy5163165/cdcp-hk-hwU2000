package HW_vpnManager;

/**
 *	Generated from IDL definition of alias "MatrixFlowDomainFragmentList_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragmentList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_vpnManager.MatrixFlowDomainFragment_T[] value;

	public MatrixFlowDomainFragmentList_THolder ()
	{
	}
	public MatrixFlowDomainFragmentList_THolder (final HW_vpnManager.MatrixFlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MatrixFlowDomainFragmentList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MatrixFlowDomainFragmentList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MatrixFlowDomainFragmentList_THelper.write (out,value);
	}
}
