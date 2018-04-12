package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMPointDirection_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPointDirection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EthernetOAMPointDirection_T value;

	public EthernetOAMPointDirection_THolder ()
	{
	}
	public EthernetOAMPointDirection_THolder (final EthernetOAMPointDirection_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetOAMPointDirection_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetOAMPointDirection_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetOAMPointDirection_THelper.write (out,value);
	}
}
