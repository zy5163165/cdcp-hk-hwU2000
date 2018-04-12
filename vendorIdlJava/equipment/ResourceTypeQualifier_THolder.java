package equipment;
/**
 *	Generated from IDL definition of enum "ResourceTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class ResourceTypeQualifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ResourceTypeQualifier_T value;

	public ResourceTypeQualifier_THolder ()
	{
	}
	public ResourceTypeQualifier_THolder (final ResourceTypeQualifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ResourceTypeQualifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourceTypeQualifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ResourceTypeQualifier_THelper.write (out,value);
	}
}
