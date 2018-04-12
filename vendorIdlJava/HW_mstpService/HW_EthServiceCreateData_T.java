package HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_EthServiceCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_EthServiceCreateData_T(){}
	public HW_mstpService.HW_EthServiceType_T serviceType;
	public globaldefs.ConnectionDirection_T direction;
	public HW_mstpService.HW_EthServiceTP_T aEndPoint;
	public HW_mstpService.HW_EthServiceTP_T zEndPoint;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_EthServiceCreateData_T(HW_mstpService.HW_EthServiceType_T serviceType, globaldefs.ConnectionDirection_T direction, HW_mstpService.HW_EthServiceTP_T aEndPoint, HW_mstpService.HW_EthServiceTP_T zEndPoint, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.serviceType = serviceType;
		this.direction = direction;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.additionalInfo = additionalInfo;
	}
}
