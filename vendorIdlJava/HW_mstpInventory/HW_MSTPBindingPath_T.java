package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_MSTPBindingPath_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPBindingPath_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MSTPBindingPath_T(){}
	public terminationPoint.Directionality_T direction;
	public globaldefs.NameAndStringValue_T[][] allPathList;
	public globaldefs.NameAndStringValue_T[][] usedPathList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MSTPBindingPath_T(terminationPoint.Directionality_T direction, globaldefs.NameAndStringValue_T[][] allPathList, globaldefs.NameAndStringValue_T[][] usedPathList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.direction = direction;
		this.allPathList = allPathList;
		this.usedPathList = usedPathList;
		this.additionalInfo = additionalInfo;
	}
}
