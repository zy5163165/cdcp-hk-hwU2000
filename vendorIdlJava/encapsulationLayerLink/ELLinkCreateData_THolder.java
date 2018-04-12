package encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "ELLinkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public encapsulationLayerLink.ELLinkCreateData_T value;

	public ELLinkCreateData_THolder ()
	{
	}
	public ELLinkCreateData_THolder(final encapsulationLayerLink.ELLinkCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return encapsulationLayerLink.ELLinkCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = encapsulationLayerLink.ELLinkCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		encapsulationLayerLink.ELLinkCreateData_THelper.write(_out, value);
	}
}
