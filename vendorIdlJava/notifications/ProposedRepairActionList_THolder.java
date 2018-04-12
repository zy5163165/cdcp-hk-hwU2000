package notifications;

/**
 *	Generated from IDL definition of alias "ProposedRepairActionList_T"
 *	@author JacORB IDL compiler 
 */

public final class ProposedRepairActionList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ProposedRepairActionList_THolder ()
	{
	}
	public ProposedRepairActionList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProposedRepairActionList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProposedRepairActionList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProposedRepairActionList_THelper.write (out,value);
	}
}
