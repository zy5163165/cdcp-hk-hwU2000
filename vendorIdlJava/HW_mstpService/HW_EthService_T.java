package HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_EthService_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthService_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_EthService_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public HW_mstpService.HW_EthServiceType_T serviceType;
	public globaldefs.ConnectionDirection_T direction;
	public boolean activeState;
	public HW_mstpService.HW_EthServiceTP_T aEndPoint;
	public HW_mstpService.HW_EthServiceTP_T zEndPoint;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_EthService_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, HW_mstpService.HW_EthServiceType_T serviceType, globaldefs.ConnectionDirection_T direction, boolean activeState, HW_mstpService.HW_EthServiceTP_T aEndPoint, HW_mstpService.HW_EthServiceTP_T zEndPoint, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.serviceType = serviceType;
		this.direction = direction;
		this.activeState = activeState;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.additionalInfo = additionalInfo;
	}
}
