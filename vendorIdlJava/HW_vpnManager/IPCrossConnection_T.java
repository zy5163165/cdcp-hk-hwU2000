package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "IPCrossConnection_T"
 *	@author JacORB IDL compiler 
 */

public final class IPCrossConnection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IPCrossConnection_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public java.lang.String userLabel = "";
	public subnetworkConnection.SNCState_T activeState;
	public performance.AdministrativeState_T administrativeState;
	public globaldefs.ConnectionDirection_T direction;
	public subnetworkConnection.SNCType_T ccType;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEndList;
	public subnetworkConnection.TPData_T[] zEndList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPCrossConnection_T(globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, java.lang.String userLabel, subnetworkConnection.SNCState_T activeState, performance.AdministrativeState_T administrativeState, globaldefs.ConnectionDirection_T direction, subnetworkConnection.SNCType_T ccType, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEndList, subnetworkConnection.TPData_T[] zEndList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.userLabel = userLabel;
		this.activeState = activeState;
		this.administrativeState = administrativeState;
		this.direction = direction;
		this.ccType = ccType;
		this.transmissionParams = transmissionParams;
		this.aEndList = aEndList;
		this.zEndList = zEndList;
		this.additionalInfo = additionalInfo;
	}
}
