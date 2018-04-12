package flowDomain;
/**
 *	Generated from IDL definition of enum "EthernetOAMCommandType_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMCommandType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EthernetOAMCommandType_T value;

	public EthernetOAMCommandType_THolder ()
	{
	}
	public EthernetOAMCommandType_THolder (final EthernetOAMCommandType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetOAMCommandType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetOAMCommandType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetOAMCommandType_THelper.write (out,value);
	}
}
