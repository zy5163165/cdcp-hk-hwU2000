package equipment;

/**
 *	Generated from IDL definition of alias "ObjectAdditionalInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAdditionalInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.ObjectAdditionalInfo_T[] value;

	public ObjectAdditionalInfoList_THolder ()
	{
	}
	public ObjectAdditionalInfoList_THolder (final equipment.ObjectAdditionalInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectAdditionalInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectAdditionalInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectAdditionalInfoList_THelper.write (out,value);
	}
}
