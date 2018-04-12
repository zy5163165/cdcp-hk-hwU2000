package emsMgr;

/**
 *	Generated from IDL definition of struct "EMS_T"
 *	@author JacORB IDL compiler 
 */

public final class EMS_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EMS_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String emsVersion = "";
	public java.lang.String type = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EMS_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String emsVersion, java.lang.String type, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.emsVersion = emsVersion;
		this.type = type;
		this.additionalInfo = additionalInfo;
	}
}
