package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public HW_vpnManager.ServerTrailType_T[] vendorExtensions;
	public java.lang.String fdfrType;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FDFrCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, HW_vpnManager.ServerTrailType_T[] vendorExtensions, java.lang.String fdfrType, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.multipointServiceAttr = multipointServiceAttr;
		this.vendorExtensions = vendorExtensions;
		this.fdfrType = fdfrType;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
