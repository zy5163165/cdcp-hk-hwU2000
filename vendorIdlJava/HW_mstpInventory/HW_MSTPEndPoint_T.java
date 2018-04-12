package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_MSTPEndPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPEndPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MSTPEndPoint_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public terminationPoint.Directionality_T direction;
	public HW_mstpInventory.HW_MSTPEndPointType_T type;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MSTPEndPoint_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, terminationPoint.Directionality_T direction, HW_mstpInventory.HW_MSTPEndPointType_T type, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.type = type;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
