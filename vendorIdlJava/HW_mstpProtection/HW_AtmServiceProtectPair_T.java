package HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmServiceProtectPair_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceProtectPair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmServiceProtectPair_T(){}
	public globaldefs.NameAndStringValue_T[] workServiceName;
	public globaldefs.NameAndStringValue_T[] protectServiceName;
	public HW_mstpProtection.HW_AtmMonitorFlag_T monitorFlag;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceProtectPair_T(globaldefs.NameAndStringValue_T[] workServiceName, globaldefs.NameAndStringValue_T[] protectServiceName, HW_mstpProtection.HW_AtmMonitorFlag_T monitorFlag, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.workServiceName = workServiceName;
		this.protectServiceName = protectServiceName;
		this.monitorFlag = monitorFlag;
		this.additionalInfo = additionalInfo;
	}
}
