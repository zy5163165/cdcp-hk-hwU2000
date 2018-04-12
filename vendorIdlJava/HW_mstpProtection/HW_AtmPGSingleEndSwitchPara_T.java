package HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmPGSingleEndSwitchPara_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSingleEndSwitchPara_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmPGSingleEndSwitchPara_T(){}
	public protection.SwitchReason_T switchReason;
	public HW_mstpProtection.HW_SwitchState_T switchState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSingleEndSwitchPara_T(protection.SwitchReason_T switchReason, HW_mstpProtection.HW_SwitchState_T switchState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.switchReason = switchReason;
		this.switchState = switchState;
		this.additionalInfo = additionalInfo;
	}
}
