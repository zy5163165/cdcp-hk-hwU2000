package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
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
