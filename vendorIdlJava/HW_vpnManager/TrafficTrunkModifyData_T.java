package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunkModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunkModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficTrunkModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public HW_vpnManager.IPCrossConnection_T[] addedOrNewRoute;
	public HW_vpnManager.IPCrossConnection_T[] removedRoute;
	public globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficTrunkModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.ConnectionDirection_T direction, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, transmissionParameters.LayeredParameters_T transmissionParams, HW_vpnManager.IPCrossConnection_T[] addedOrNewRoute, HW_vpnManager.IPCrossConnection_T[] removedRoute, globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, globaldefs.NameAndStringValue_T[][] neTpSncExclusions, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.transmissionParams = transmissionParams;
		this.addedOrNewRoute = addedOrNewRoute;
		this.removedRoute = removedRoute;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalInfo = additionalInfo;
	}
}
