package topologicalLink;

/**
 *	Generated from IDL definition of alias "TopologicalLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public topologicalLink.TopologicalLink_T[] value;

	public TopologicalLinkList_THolder ()
	{
	}
	public TopologicalLinkList_THolder (final topologicalLink.TopologicalLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TopologicalLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopologicalLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TopologicalLinkList_THelper.write (out,value);
	}
}
