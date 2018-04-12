package managedElementManager.ManagedElementMgr_IPackage;

/**
 *	Generated from IDL definition of struct "CommonObjSturct_T"
 *	@author JacORB IDL compiler 
 */

public final class CommonObjSturct_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CommonObjSturct_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public globaldefs.NameAndStringValue_T[] attributes;
	public CommonObjSturct_T(globaldefs.NameAndStringValue_T[] name, globaldefs.NameAndStringValue_T[] attributes)
	{
		this.name = name;
		this.attributes = attributes;
	}
}
