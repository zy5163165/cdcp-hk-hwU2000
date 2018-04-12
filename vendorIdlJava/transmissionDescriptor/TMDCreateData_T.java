package transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TMDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TMDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TMDCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalObjectInfo;
	public globaldefs.NameAndStringValue_T[] containingTMDName;
	public java.lang.String externalRepresentationReference = "";
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TMDCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalObjectInfo, globaldefs.NameAndStringValue_T[] containingTMDName, java.lang.String externalRepresentationReference, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalObjectInfo = additionalObjectInfo;
		this.containingTMDName = containingTMDName;
		this.externalRepresentationReference = externalRepresentationReference;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
