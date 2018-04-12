package encapsulationLayerLink;
/**
 *	Generated from IDL definition of enum "LinkType_T"
 *	@author JacORB IDL compiler 
 */

public final class LinkType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public LinkType_T value;

	public LinkType_THolder ()
	{
	}
	public LinkType_THolder (final LinkType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LinkType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LinkType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LinkType_THelper.write (out,value);
	}
}
