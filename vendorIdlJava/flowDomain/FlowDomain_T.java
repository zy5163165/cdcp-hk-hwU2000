package flowDomain;

/**
 *	Generated from IDL definition of struct "FlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FlowDomain_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[][] mfds;
	public globaldefs.NameAndStringValue_T[][] fdEdgeCPTPs;
	public globaldefs.NameAndStringValue_T[][] fdInternalCPTPs;
	public flowDomain.ConnectivityState_T fDConnectivityState;
	public java.lang.String fdType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomain_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[][] mfds, globaldefs.NameAndStringValue_T[][] fdEdgeCPTPs, globaldefs.NameAndStringValue_T[][] fdInternalCPTPs, flowDomain.ConnectivityState_T fDConnectivityState, java.lang.String fdType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.networkAccessDomain = networkAccessDomain;
		this.mfds = mfds;
		this.fdEdgeCPTPs = fdEdgeCPTPs;
		this.fdInternalCPTPs = fdInternalCPTPs;
		this.fDConnectivityState = fDConnectivityState;
		this.fdType = fdType;
		this.additionalInfo = additionalInfo;
	}
}
