package terminationPoint;
/**
 *	Generated from IDL definition of enum "TPProtectionAssociation_T"
 *	@author JacORB IDL compiler 
 */

public final class TPProtectionAssociation_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TPProtectionAssociation_T value;

	public TPProtectionAssociation_THolder ()
	{
	}
	public TPProtectionAssociation_THolder (final TPProtectionAssociation_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPProtectionAssociation_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPProtectionAssociation_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPProtectionAssociation_THelper.write (out,value);
	}
}
