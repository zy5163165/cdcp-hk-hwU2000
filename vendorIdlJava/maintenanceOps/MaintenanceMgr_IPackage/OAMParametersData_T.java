package maintenanceOps.MaintenanceMgr_IPackage;

/**
 *	Generated from IDL definition of struct "OAMParametersData_T"
 *	@author JacORB IDL compiler 
 */

public final class OAMParametersData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public OAMParametersData_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public OAMParametersData_T(globaldefs.NameAndStringValue_T[] objectName, transmissionParameters.LayeredParameters_T[] transmissionParams)
	{
		this.objectName = objectName;
		this.transmissionParams = transmissionParams;
	}
}
