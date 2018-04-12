package HW_controlPlane;

/**
 *	Generated from IDL definition of struct "HW_SnppLink_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SnppLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_SnppLink_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] aEndSnppName;
	public globaldefs.NameAndStringValue_T[] zEndSnppName;
	public globaldefs.ConnectionDirection_T direction;
	public short[] rateList;
	public short cost;
	public java.lang.String protectType;
	public HW_controlPlane.HW_Capacity_T[] linkCapacity;
	public java.lang.String linkState;
	public int[] srlgIDList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_SnppLink_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] aEndSnppName, globaldefs.NameAndStringValue_T[] zEndSnppName, globaldefs.ConnectionDirection_T direction, short[] rateList, short cost, java.lang.String protectType, HW_controlPlane.HW_Capacity_T[] linkCapacity, java.lang.String linkState, int[] srlgIDList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.aEndSnppName = aEndSnppName;
		this.zEndSnppName = zEndSnppName;
		this.direction = direction;
		this.rateList = rateList;
		this.cost = cost;
		this.protectType = protectType;
		this.linkCapacity = linkCapacity;
		this.linkState = linkState;
		this.srlgIDList = srlgIDList;
		this.additionalInfo = additionalInfo;
	}
}
