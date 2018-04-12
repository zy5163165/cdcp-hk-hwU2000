package maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenanceAssociation_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceAssociation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MaintenanceAssociation_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] associatedService;
	public globaldefs.NameAndStringValue_T[] maParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenanceAssociation_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] associatedService, globaldefs.NameAndStringValue_T[] maParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.associatedService = associatedService;
		this.maParameters = maParameters;
		this.additionalInfo = additionalInfo;
	}
}
