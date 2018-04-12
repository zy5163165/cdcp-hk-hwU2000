package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunk_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunk_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficTrunk_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public subnetworkConnection.SNCState_T activeState;
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public performance.AdministrativeState_T administrativeState;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficTrunk_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, subnetworkConnection.SNCState_T activeState, globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, performance.AdministrativeState_T administrativeState, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.activeState = activeState;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.administrativeState = administrativeState;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.additionalInfo = additionalInfo;
	}
}
