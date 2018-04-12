package encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "ELLinkModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ELLinkModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public ELLinkModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, transmissionParameters.LayeredParameters_T transmissionParams, globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.transmissionParams = transmissionParams;
		this.additionalModificationInfo = additionalModificationInfo;
	}
}
