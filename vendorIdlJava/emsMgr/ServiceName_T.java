package emsMgr;

/**
 *	Generated from IDL definition of struct "ServiceName_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceName_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServiceName_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public ServiceName_T(globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
	}
}
