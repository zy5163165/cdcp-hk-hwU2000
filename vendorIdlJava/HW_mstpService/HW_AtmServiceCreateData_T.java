package HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_AtmServiceCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmServiceCreateData_T(){}
	public HW_mstpProtection.HW_AtmProtectType_T protectType;
	public HW_mstpService.HW_AtmServiceType_T serviceType;
	public HW_mstpService.HW_AtmServiceSpreadType_T spreadType;
	public HW_mstpService.HW_AtmProtectRole_T protectRole;
	public HW_mstpService.HW_AtmServiceTP_T aEndPoint;
	public HW_mstpService.HW_AtmServiceTP_T zEndPoint;
	public boolean active;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceCreateData_T(HW_mstpProtection.HW_AtmProtectType_T protectType, HW_mstpService.HW_AtmServiceType_T serviceType, HW_mstpService.HW_AtmServiceSpreadType_T spreadType, HW_mstpService.HW_AtmProtectRole_T protectRole, HW_mstpService.HW_AtmServiceTP_T aEndPoint, HW_mstpService.HW_AtmServiceTP_T zEndPoint, boolean active, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectType = protectType;
		this.serviceType = serviceType;
		this.spreadType = spreadType;
		this.protectRole = protectRole;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.active = active;
		this.additionalInfo = additionalInfo;
	}
}
