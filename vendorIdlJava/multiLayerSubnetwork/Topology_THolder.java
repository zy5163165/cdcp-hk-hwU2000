package multiLayerSubnetwork;
/**
 *	Generated from IDL definition of enum "Topology_T"
 *	@author JacORB IDL compiler 
 */

public final class Topology_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public Topology_T value;

	public Topology_THolder ()
	{
	}
	public Topology_THolder (final Topology_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Topology_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Topology_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		Topology_THelper.write (out,value);
	}
}
