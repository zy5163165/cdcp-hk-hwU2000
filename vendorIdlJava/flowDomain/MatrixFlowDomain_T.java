package flowDomain;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MatrixFlowDomain_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[][] assignedCPTPs;
	public boolean flexible;
	public globaldefs.NameAndStringValue_T[][] transmissionDescriptorName;
	public java.lang.String transmissionDescriptorState = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomain_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[][] assignedCPTPs, boolean flexible, globaldefs.NameAndStringValue_T[][] transmissionDescriptorName, java.lang.String transmissionDescriptorState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.networkAccessDomain = networkAccessDomain;
		this.assignedCPTPs = assignedCPTPs;
		this.flexible = flexible;
		this.transmissionDescriptorName = transmissionDescriptorName;
		this.transmissionDescriptorState = transmissionDescriptorState;
		this.additionalInfo = additionalInfo;
	}
}
