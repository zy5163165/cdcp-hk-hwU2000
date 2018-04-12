package maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_ATMMaintenanceEntityAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ATMMaintenanceEntityAttr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_ATMMaintenanceEntityAttr_T(){}
	public globaldefs.NameAndStringValue_T[] aEndName;
	public globaldefs.NameAndStringValue_T[] zEndName;
	public globaldefs.NameAndStringValue_T[] serviceName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ATMMaintenanceEntityAttr_T(globaldefs.NameAndStringValue_T[] aEndName, globaldefs.NameAndStringValue_T[] zEndName, globaldefs.NameAndStringValue_T[] serviceName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.aEndName = aEndName;
		this.zEndName = zEndName;
		this.serviceName = serviceName;
		this.additionalInfo = additionalInfo;
	}
}
