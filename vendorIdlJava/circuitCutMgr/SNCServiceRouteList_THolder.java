package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "SNCServiceRouteList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCServiceRouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.SNCServiceRoute_T[] value;

	public SNCServiceRouteList_THolder ()
	{
	}
	public SNCServiceRouteList_THolder (final circuitCutMgr.SNCServiceRoute_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCServiceRouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCServiceRouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCServiceRouteList_THelper.write (out,value);
	}
}
