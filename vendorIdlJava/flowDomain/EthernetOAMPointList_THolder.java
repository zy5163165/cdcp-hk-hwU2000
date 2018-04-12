package flowDomain;

/**
 *	Generated from IDL definition of alias "EthernetOAMPointList_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.EthernetOAMPoint_T[] value;

	public EthernetOAMPointList_THolder ()
	{
	}
	public EthernetOAMPointList_THolder (final flowDomain.EthernetOAMPoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetOAMPointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetOAMPointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetOAMPointList_THelper.write (out,value);
	}
}
