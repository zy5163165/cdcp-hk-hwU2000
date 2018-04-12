package encapsulationLayerLink;

/**
 *	Generated from IDL definition of alias "ELLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public encapsulationLayerLink.EncapsulationLayerLink_T[] value;

	public ELLinkList_THolder ()
	{
	}
	public ELLinkList_THolder (final encapsulationLayerLink.EncapsulationLayerLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ELLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ELLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ELLinkList_THelper.write (out,value);
	}
}
