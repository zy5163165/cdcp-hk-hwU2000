package managedElementManager.ManagedElementMgr_IPackage;


/**
 *	Generated from IDL definition of struct "CommonObjSturct_T"
 *	@author JacORB IDL compiler 
 */

public final class CommonObjSturct_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.id(),"CommonObjSturct_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("attributes", globaldefs.NamingAttributes_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I/CommonObjSturct_T:1.0";
	}
	public static managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T result = new managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.attributes = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		globaldefs.NVSList_THelper.write(out,s.attributes);
	}
}
