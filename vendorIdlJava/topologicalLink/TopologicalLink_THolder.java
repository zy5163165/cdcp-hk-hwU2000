package topologicalLink;

/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public topologicalLink.TopologicalLink_T value;

	public TopologicalLink_THolder ()
	{
	}
	public TopologicalLink_THolder(final topologicalLink.TopologicalLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return topologicalLink.TopologicalLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = topologicalLink.TopologicalLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		topologicalLink.TopologicalLink_THelper.write(_out, value);
	}
}
