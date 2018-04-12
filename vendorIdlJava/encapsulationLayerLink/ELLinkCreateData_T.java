package encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "ELLinkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ELLinkCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public short rate;
	public encapsulationLayerLink.LinkType_T type;
	public globaldefs.NameAndStringValue_T[][] endTPs;
	public boolean segment;
	public encapsulationLayerLink.BandwidthProvisioningMode_T provisioningMode;
	public subnetworkConnection.SNCCreateData_T[] sncList;
	public globaldefs.NameAndStringValue_T[] callName;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public ELLinkCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, transmissionParameters.LayeredParameters_T transmissionParams, short rate, encapsulationLayerLink.LinkType_T type, globaldefs.NameAndStringValue_T[][] endTPs, boolean segment, encapsulationLayerLink.BandwidthProvisioningMode_T provisioningMode, subnetworkConnection.SNCCreateData_T[] sncList, globaldefs.NameAndStringValue_T[] callName, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.transmissionParams = transmissionParams;
		this.rate = rate;
		this.type = type;
		this.endTPs = endTPs;
		this.segment = segment;
		this.provisioningMode = provisioningMode;
		this.sncList = sncList;
		this.callName = callName;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
