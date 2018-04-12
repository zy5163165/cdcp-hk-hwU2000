package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_LAGBranchPort_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_LAGBranchPort_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_LAGBranchPort_T(){}
	public globaldefs.NameAndStringValue_T[] branchPortName;
	public globaldefs.NameAndStringValue_T[] branchPortParaList;
	public HW_LAGBranchPort_T(globaldefs.NameAndStringValue_T[] branchPortName, globaldefs.NameAndStringValue_T[] branchPortParaList)
	{
		this.branchPortName = branchPortName;
		this.branchPortParaList = branchPortParaList;
	}
}
