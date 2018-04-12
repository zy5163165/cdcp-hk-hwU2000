package managedElementManager.ManagedElementMgr_IPackage;

/**
 *	Generated from IDL definition of struct "CommonObjSturct_T"
 *	@author JacORB IDL compiler 
 */

public final class CommonObjSturct_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T value;

	public CommonObjSturct_THolder ()
	{
	}
	public CommonObjSturct_THolder(final managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out, value);
	}
}
