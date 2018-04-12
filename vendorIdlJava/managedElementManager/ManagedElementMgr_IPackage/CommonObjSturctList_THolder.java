package managedElementManager.ManagedElementMgr_IPackage;

/**
 *	Generated from IDL definition of alias "CommonObjSturctList_T"
 *	@author JacORB IDL compiler 
 */

public final class CommonObjSturctList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[] value;

	public CommonObjSturctList_THolder ()
	{
	}
	public CommonObjSturctList_THolder (final managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CommonObjSturctList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CommonObjSturctList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CommonObjSturctList_THelper.write (out,value);
	}
}
