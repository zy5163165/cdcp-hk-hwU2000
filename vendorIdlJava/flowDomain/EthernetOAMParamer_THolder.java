package flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMParamer_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMParamer_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.EthernetOAMParamer_T value;

	public EthernetOAMParamer_THolder ()
	{
	}
	public EthernetOAMParamer_THolder(final flowDomain.EthernetOAMParamer_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.EthernetOAMParamer_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.EthernetOAMParamer_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.EthernetOAMParamer_THelper.write(_out, value);
	}
}
