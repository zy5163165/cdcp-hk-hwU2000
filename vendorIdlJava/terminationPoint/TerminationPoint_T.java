package terminationPoint;

import java.util.Arrays;

/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TerminationPoint_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public terminationPoint.TPType_T type;
	public terminationPoint.TPConnectionState_T connectionState;
	public terminationPoint.TerminationMode_T tpMappingMode;
	public terminationPoint.Directionality_T direction;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TerminationPoint_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, terminationPoint.TPType_T type, terminationPoint.TPConnectionState_T connectionState, terminationPoint.TerminationMode_T tpMappingMode, terminationPoint.Directionality_T direction, transmissionParameters.LayeredParameters_T[] transmissionParams, terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.type = type;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalInfo = additionalInfo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TerminationPoint_T [additionalInfo="
				+ Arrays.toString(additionalInfo) + ", connectionState="
				+ connectionState + ", direction=" + direction + ", edgePoint="
				+ edgePoint + ", egressTrafficDescriptorName="
				+ Arrays.toString(egressTrafficDescriptorName)
				+ ", ingressTrafficDescriptorName="
				+ Arrays.toString(ingressTrafficDescriptorName) + ", name="
				+ Arrays.toString(name) + ", nativeEMSName=" + nativeEMSName
				+ ", owner=" + owner + ", tpMappingMode=" + tpMappingMode
				+ ", tpProtectionAssociation=" + tpProtectionAssociation
				+ ", transmissionParams=" + Arrays.toString(transmissionParams)
				+ ", type=" + type + ", userLabel=" + userLabel + "]";
	}
}
