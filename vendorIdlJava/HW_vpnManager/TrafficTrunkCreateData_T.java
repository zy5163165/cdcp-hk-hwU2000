package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunkCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficTrunkCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public boolean fullRoute;
	public globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public HW_vpnManager.IPCrossConnection_T[] ipCCInclusions;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TrafficTrunkCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.ConnectionDirection_T direction, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, transmissionParameters.LayeredParameters_T transmissionParams, boolean fullRoute, globaldefs.NameAndStringValue_T[][] neTpInclusions, globaldefs.NameAndStringValue_T[][] neTpSncExclusions, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, HW_vpnManager.IPCrossConnection_T[] ipCCInclusions, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.transmissionParams = transmissionParams;
		this.fullRoute = fullRoute;
		this.neTpInclusions = neTpInclusions;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.ipCCInclusions = ipCCInclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
