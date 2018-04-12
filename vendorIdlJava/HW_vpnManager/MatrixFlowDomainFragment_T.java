package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MatrixFlowDomainFragment_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public subnetworkConnection.SNCState_T fdfrState;
	public performance.AdministrativeState_T administrativeState;
	public boolean flexible;
	public java.lang.String mfdfrType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomainFragment_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, subnetworkConnection.SNCState_T fdfrState, performance.AdministrativeState_T administrativeState, boolean flexible, java.lang.String mfdfrType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.multipointServiceAttr = multipointServiceAttr;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.fdfrState = fdfrState;
		this.administrativeState = administrativeState;
		this.flexible = flexible;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
}
