package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "MFDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MFDFrModifyData_T(){}
	public java.lang.String modifyType = "";
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MFDFrModifyData_T(java.lang.String modifyType, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.modifyType = modifyType;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.multipointServiceAttr = multipointServiceAttr;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalInfo = additionalInfo;
	}
}
