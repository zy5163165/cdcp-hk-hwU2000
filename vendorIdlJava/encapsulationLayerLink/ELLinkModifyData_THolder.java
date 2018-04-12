package encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "ELLinkModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public encapsulationLayerLink.ELLinkModifyData_T value;

	public ELLinkModifyData_THolder ()
	{
	}
	public ELLinkModifyData_THolder(final encapsulationLayerLink.ELLinkModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return encapsulationLayerLink.ELLinkModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = encapsulationLayerLink.ELLinkModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		encapsulationLayerLink.ELLinkModifyData_THelper.write(_out, value);
	}
}
