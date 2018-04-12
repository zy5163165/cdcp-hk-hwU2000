package flowDomain;

/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FTPCreateData_T(){}
	public globaldefs.NameAndStringValue_T[] equipmentName;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String ftpType = "";
	public globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public terminationPoint.TPConnectionState_T connectionState;
	public terminationPoint.TerminationMode_T tpMappingMode;
	public terminationPoint.Directionality_T direction;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FTPCreateData_T(globaldefs.NameAndStringValue_T[] equipmentName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String ftpType, globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, terminationPoint.TPConnectionState_T connectionState, terminationPoint.TerminationMode_T tpMappingMode, terminationPoint.Directionality_T direction, transmissionParameters.LayeredParameters_T[] transmissionParams, terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.equipmentName = equipmentName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.ftpType = ftpType;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
