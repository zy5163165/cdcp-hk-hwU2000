package HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmPGSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmPGSwitchData_T(){}
	public globaldefs.NameAndStringValue_T[] pgName;
	public HW_mstpProtection.HW_AtmProtectType_T protectType;
	public HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T srcEndSwitchPara;
	public HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T snkEndSwitchPara;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSwitchData_T(globaldefs.NameAndStringValue_T[] pgName, HW_mstpProtection.HW_AtmProtectType_T protectType, HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T srcEndSwitchPara, HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T snkEndSwitchPara, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.pgName = pgName;
		this.protectType = protectType;
		this.srcEndSwitchPara = srcEndSwitchPara;
		this.snkEndSwitchPara = snkEndSwitchPara;
		this.additionalInfo = additionalInfo;
	}
}
