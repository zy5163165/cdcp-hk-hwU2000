package maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenancePoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MaintenancePoint_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] tpName;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenancePoint_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] tpName, transmissionParameters.LayeredParameters_T transmissionParams, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.tpName = tpName;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
