package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_LinkAggregationGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_LinkAggregationGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_LinkAggregationGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] paraList;
	public globaldefs.NameAndStringValue_T[] mainPortName;
	public HW_mstpInventory.HW_LAGBranchPort_T[] branchPortList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_LinkAggregationGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[] mainPortName, HW_mstpInventory.HW_LAGBranchPort_T[] branchPortList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.paraList = paraList;
		this.mainPortName = mainPortName;
		this.branchPortList = branchPortList;
		this.additionalInfo = additionalInfo;
	}
}
