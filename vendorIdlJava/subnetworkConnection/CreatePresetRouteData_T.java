package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CreatePresetRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreatePresetRouteData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CreatePresetRouteData_T(){}
	public globaldefs.NameAndStringValue_T[] sncName;
	public int presetRouteID;
	public int priority;
	public globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public CreatePresetRouteData_T(globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, int priority, globaldefs.NameAndStringValue_T[][] neTpInclusions, globaldefs.NameAndStringValue_T[][] neTpSncExclusions, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName = sncName;
		this.presetRouteID = presetRouteID;
		this.priority = priority;
		this.neTpInclusions = neTpInclusions;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalInfo = additionalInfo;
	}
}
