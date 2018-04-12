package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "ResourceList_T"
 *	@author JacORB IDL compiler 
 */

public final class ResourceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[][] value;

	public ResourceList_THolder ()
	{
	}
	public ResourceList_THolder (final globaldefs.NameAndStringValue_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ResourceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ResourceList_THelper.write (out,value);
	}
}
