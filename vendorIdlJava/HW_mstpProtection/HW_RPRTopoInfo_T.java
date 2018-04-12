package HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRTopoInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRTopoInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_RPRTopoInfo_T(){}
	public globaldefs.NameAndStringValue_T[] nodeName;
	public globaldefs.NameAndStringValue_T[] topoParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRTopoInfo_T(globaldefs.NameAndStringValue_T[] nodeName, globaldefs.NameAndStringValue_T[] topoParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeName = nodeName;
		this.topoParameters = topoParameters;
		this.additionalInfo = additionalInfo;
	}
}
