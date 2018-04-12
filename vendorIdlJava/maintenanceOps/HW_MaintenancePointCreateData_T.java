package maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenancePointCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePointCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MaintenancePointCreateData_T(){}
	public globaldefs.NameAndStringValue_T[] mdOrMaName;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public globaldefs.NameAndStringValue_T[] tpName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenancePointCreateData_T(globaldefs.NameAndStringValue_T[] mdOrMaName, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, transmissionParameters.LayeredParameters_T transmissionParams, globaldefs.NameAndStringValue_T[] tpName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.mdOrMaName = mdOrMaName;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.tpName = tpName;
		this.additionalInfo = additionalInfo;
	}
}
